package demoAPI_testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class demo_patch_test {

    @Test
    public void patch_test()
    {
        baseURI="http://localhost:3000";

        JSONObject jsonObject=new JSONObject();

        jsonObject.put("userId",30);


        given().
                body(jsonObject.toJSONString()).
        when().
                patch("/orders/2").
        then().
                statusCode(200).log().all();
    }




}
