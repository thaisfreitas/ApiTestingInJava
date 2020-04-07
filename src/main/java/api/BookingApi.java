package api;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.BookingPayload;

import static io.restassured.RestAssured.given;

public class BookingApi {

        private static final String apiUrl = "https://restful-booker.herokuapp.com/booking/";

    public static Response getBookingApi() {
        return given().get(apiUrl);
    }

    public static Response getBookingByIdApi(String bookingId, String mediaType){
        return given()
                .header("Accept", mediaType)
                .get(apiUrl + bookingId);
    }

    public static Response postBooking(BookingPayload bookingPayload){
        return given()
                .contentType(ContentType.JSON)
                .body(bookingPayload)
                .when()
                .post(apiUrl);

    }
}
