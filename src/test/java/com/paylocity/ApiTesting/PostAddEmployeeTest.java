package com.paylocity.ApiTesting;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class PostAddEmployeeTest {
    @BeforeAll

    public static void init() {
        baseURI =
                "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com";
        basePath =
                "/Prod/";
    }

    @AfterAll
    public static void cleanup() {
        RestAssured.reset();
    }
        @DisplayName("Post/ Add Employee")
                @Test
                public void testAddEmployeeData(){


    String addEmployee = "{\n" +

            "        \"firstName\": \"Avrora\",\n" +
            "        \"lastName\": \"Pokita\",\n" +
            "        \"dependants\": 6,\n" +
            "    }";
        given()
                //.contentType(ContentType.JSON)
                .log().all()
                .header("Content-Type","application/json")
                .header("Authorization","Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
                .body(addEmployee)
                .when().post("/api/Employees")
                .then()
                .log().all()
                .statusCode(200);


    }

}
