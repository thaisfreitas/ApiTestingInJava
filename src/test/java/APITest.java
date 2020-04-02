import api.BookingApi;
import io.restassured.response.Response;
import org.junit.Test;
;import static io.restassured.RestAssured.given;
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
}
