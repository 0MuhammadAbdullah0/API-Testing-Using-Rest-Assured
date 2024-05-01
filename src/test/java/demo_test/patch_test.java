package demo_test;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class patch_test {

    @Test
    public void patchtest()
    {
        baseURI = "https://reqres.in/api";

        JSONObject object=new JSONObject();

        object.put("job","desinger");

        given().
                body(object.toJSONString()).
        when().
                patch("users/2").
        then().
                statusCode(200).log().all();

    }







}
