package ru.netology.rest;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void mustReturnData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Нетология")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Яндекс"));
    }



}
