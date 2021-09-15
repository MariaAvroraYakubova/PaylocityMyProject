package com.paylocity.ApiTesting;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class DeleteEmployee {

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
    @DisplayName("Delete/ Delete Employee")
    @Test
    public void deleteEmployeeData(){
        given()
                .header("Authorization","Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
                .pathParam("id","d5a768d9-cba2-413e-b7d3-6d5101322e44")

                .when()
                .delete("api/employees/{id}")
                .then()
                .log().all()
                .statusCode(200);


    }

    }
