package com.paylocity.ApiTesting;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;


public class GetEmployeeListTest {

    @Test
   // @BeforeAll
    //public static void init() {
    public void auth() {
    baseURI = //"https://www.paylocity.com";
            "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com";
    basePath = //"/Prod";
            "/Prod/api/Employees";

    given()
            .header("Authorization","Basic VGVzdFVzZXI0OTpHI18wJEFfbWpwNC0=")
    .when().get()
            .then().log().all().statusCode(200);

    }
}