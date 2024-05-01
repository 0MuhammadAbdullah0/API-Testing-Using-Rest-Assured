package demo_test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class delete_test {

    @Test
    public void deletetest() {
        baseURI = "https://reqres.in/api";

        given().
        when().
                delete("user/2").
        then().
                statusCode(204);


    }

}
