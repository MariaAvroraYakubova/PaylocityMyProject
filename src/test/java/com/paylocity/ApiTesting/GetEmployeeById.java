package com.paylocity.ApiTesting;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class GetEmployeeById {

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
    @DisplayName("Get One Employee by id ")
    @Test
    public void getOneEmployeeById(){
        given()
                .header("Authorization", "Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
                .pathParam("id","ace52731-495d-46cf-8284-3d1735af6a08")
                .when()
                .get("/api/employees/{id}")
                .then()
                .log().all()
                .statusCode(200);


    }
}
