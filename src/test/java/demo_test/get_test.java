package demo_test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.*;
import org.testng.annotations.Test;


public class get_test {

    @Test
    public void get_test() {
        baseURI = "https://reqres.in/api";

        given().
                get("users?page=2").
                then().
                statusCode(200).
                body("data[4].first_name", equalTo("George")).
                body("data.first_name", hasItems("George", "Rachel"));

    }
}