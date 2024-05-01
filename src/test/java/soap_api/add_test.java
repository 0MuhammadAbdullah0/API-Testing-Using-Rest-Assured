package soap_api;

import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class add_test {

    @Test
    public void file_add_test() throws IOException {

        File file=new File("wsdl/add.xml");
        String requestbody;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            requestbody = IOUtils.toString(fileInputStream, "UTF-8");
        }

        if (file.exists())
        {
            System.out.println("file exists");
        }

        baseURI = "http://dneonline.com/";

        given().
                contentType("text/XML").
                accept(ContentType.XML).
                body(requestbody).
        when().
                post("/calculator.asmx").
        then().
                statusCode(200).log().all().
        and().
                body(".//*:AddResult.text()",equalTo("35"));

    }

}
