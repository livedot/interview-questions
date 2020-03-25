package interview_questions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;


public class APITest {

    @Before
    public void setup(){
        baseURI = "http://54.197.201.134:8000/api";
    }

    @Test
    public void getSinglePersonInfoTest(){

        given()
                .log().all().
                when()
                .get("persons/131")
                .then()
                .log().all()
                .statusCode(200);
    }

}