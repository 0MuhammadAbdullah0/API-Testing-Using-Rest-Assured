package demo_test;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class test_2 {

    @Test
    public void test2()
    {

        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
        then().
                statusCode(200).
                body("data[1].id", equalTo(8)).log().all();


    }



}
