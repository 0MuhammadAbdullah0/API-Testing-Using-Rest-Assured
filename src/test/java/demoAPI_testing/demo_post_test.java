package demoAPI_testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class demo_post_test {
    @Test
    public void demo_post_product() {

        baseURI = "http://localhost:3000";
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", "4");
        jsonObject.put("name", "mouse");
        jsonObject.put("price", "7.99");
        jsonObject.put("description", "loremispum20");
        jsonObject.put("category", "electronics");

        given().
                body(jsonObject.toJSONString()).
                when().
                post("/products").
                then().
                statusCode(201).log().all();

    }

    @Test
    public void demo_post_user() {
        baseURI = baseURI = "http://localhost:3000";
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 20);
        jsonObject.put("username", "m_abdulllah");
        jsonObject.put("email", "abcd@gmail.com");
        jsonObject.put("password", "abcd");

        given().
                body(jsonObject.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).log().all();

    }

    @Test
    public void demo_post_order() {
        baseURI = "http://localhost:3000";
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 14);
        jsonObject.put("userId", 20);
        jsonObject.put("products", "[1,3]");
        jsonObject.put("totalprice", 1500);
        jsonObject.put("status", "queued");

        given().
                body(jsonObject.toJSONString()).
                when().
                post("/orders").
                then().
                statusCode(201).log().all();
    }

}