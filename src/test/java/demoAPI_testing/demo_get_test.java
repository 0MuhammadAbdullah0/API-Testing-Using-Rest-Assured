package demoAPI_testing;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class demo_get_test {

    @Test public void get_products()
    {
        baseURI="http://localhost:3000";

        given().
        when().
                get("/products").
        then().
                statusCode(200).log().all();
    }
    @Test
    public void get_users()
    {
        baseURI="http://localhost:3000/";

        given().
                when().
                get("/users").
                then().
                statusCode(200).log().all();

    }
    @Test
    public void get_orders()
    {
        baseURI="http://localhost:3000/";

        given().
                when().
                get("/orders").
                then().
                statusCode(200).log().all();

    }
    @Test
    public void get_specific()
    {
        baseURI="http://localhost:3000/";

        given().
        when().
                get("products").
        then().
                statusCode(200).log().all();
    }


}
