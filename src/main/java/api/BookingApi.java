package api;
import io.restassured.response.Response;

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
}
