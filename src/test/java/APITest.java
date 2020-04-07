import api.BookingApi;
import io.restassured.response.Response;
import org.junit.Test;
import payloads.BookingDatesPayload;
import payloads.BookingPayload;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class APITest {

    @Test
    public void getBooksReturning200() {
        Response response = BookingApi.getBookingApi();

        assertThat(response.getStatusCode(), equalTo(200));
    }

    @Test
    public void getBookByIdReturing200() {
        Response response = BookingApi.getBookingByIdApi("1", "application/json");

        assertThat(response.getStatusCode(), equalTo(200));
    }

    @Test
    public void getBookingIdReturns418(){
        Response response = BookingApi.getBookingByIdApi("1", "text/plain");

        assertThat(response.getStatusCode(), equalTo(418));
    }

    @Test
    public void postBookingReturns200(){
        BookingDatesPayload bookingDatesPayload = new BookingDatesPayload(new Date(), new Date());
        BookingPayload bookingPayload = new BookingPayload("Thais", "Freitas", 200, true, bookingDatesPayload,"They want to leave before bed");

        Response response = BookingApi.postBooking(bookingPayload);

        assertThat(response.getStatusCode(), equalTo(200));
    }
}
