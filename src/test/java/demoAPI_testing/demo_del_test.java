package demoAPI_testing;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class demo_del_test {

    @Test
    public void del_test()
    {
        baseURI = "http://localhost:3000";

        given().
        when().
                delete("/products/2").
        then().
                statusCode(200).log().all();


    }

}
