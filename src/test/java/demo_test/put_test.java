package demo_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class put_test {
    @Test
    public void puttest()
    {
        baseURI = "https://reqres.in/api";

        JSONObject object=new JSONObject();
        object.put("name","ali");
        object.put("job","idk");

        given().
                body(object.toJSONString()).
        when().
                put("users/2").
        then().
                statusCode(200).log().all();
    }

}
