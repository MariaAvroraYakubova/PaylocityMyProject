package com.paylocity.ApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class PutUpdateEmployee {

    @BeforeAll

    public static void init() {
        baseURI =
                "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com";
        basePath =
                "Prod/";
    }

    @AfterAll
    public static void cleanup() {

        RestAssured.reset();
    }
    @DisplayName("Put/ Update Employee")
    @Test
    public void testUpdateEmployeeData(){

        String updateEmployee = "{\n" +
                        "\"id\": \"e06de896-4a88-485d-a787-e5a237c96c08\",\n" +

                        "        \"firstName\": \"Zoe\",\n" +
                        "        \"lastName\": \"White\",\n" +
                        "        \"dependants\": 3,\n" +
                        "    }";
        given()
                .contentType(ContentType.JSON)
                .header("Authorization","Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
                .body(updateEmployee)
                .when()
                .put("api/employees")
                .then()
                .log().all()
                .statusCode(200);
    }

    }
