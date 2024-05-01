package soap_api;

import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class subtract_test {

    @Test
    public void sub_test() throws IOException {
        File file=new File("wsdl/sub.xml");
        String requestbody;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            requestbody = IOUtils.toString(fileInputStream, "UTF-8");
        }


        if (file.exists()) {
            System.out.println("true");
        }
        baseURI = "http://dneonline.com/";

        given().
                contentType("text/XML").
                accept(ContentType.XML).
                body(requestbody).
                when().
                post("/calculator.asmx").
                then().
                statusCode(200).log().all();

    }

}
