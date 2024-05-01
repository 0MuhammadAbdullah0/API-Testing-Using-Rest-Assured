package demoAPI_testing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class demo_put_test {

        @Test
        public void demo_put_product() {

            baseURI = "http://localhost:3000";
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("id", "3");
            jsonObject.put("name", "mouse");
            jsonObject.put("price", "9.99");
            jsonObject.put("description", "loremispum20");
            jsonObject.put("category", "electronics");

            given().
                    body(jsonObject.toJSONString()).
                    when().
                    put("/products/4").
                    then().
                    log().all();

        }

        @Test
        public void demo_put_user() {
            baseURI = baseURI = "http://localhost:3000";
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("id", 2);
            jsonObject.put("username", "m_abdulllah");
            jsonObject.put("email", "abcd@gmail.com");
            jsonObject.put("password", "abcd1234");

            given().
                    body(jsonObject.toJSONString()).
                    when().
                    put("/users/2").
                    then().
                    log().all();

        }

        @Test
        public void demo_put_order() {
            baseURI = "http://localhost:3000";
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("id","5");
            jsonObject.put("userId", 20);
            jsonObject.put("products","[1]");
            jsonObject.put("status", "queued");

            given().
                    body(jsonObject.toJSONString()).
                    when().
                    put("/orders/2").
                    then().
                    statusCode(200).log().all();
        }
    }

