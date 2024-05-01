package demo_test;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class post_test {

    @Test
    public void post_test()
    {

        baseURI = "https://reqres.in/api";

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","abdullah");
        jsonObject.put("job","softwareEnginner");

        given().
                body(jsonObject.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).log().all();


    }


}
