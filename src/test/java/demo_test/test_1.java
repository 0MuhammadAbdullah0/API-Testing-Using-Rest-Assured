package demo_test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class test_1 {

    @Test
    public void test_getUser()
    {

        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        int statuscode= response.statusCode();
        Assert.assertEquals(200,statuscode);
    }


}
