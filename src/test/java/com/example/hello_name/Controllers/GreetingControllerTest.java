package com.example.hello_name.Controllers;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class GreetingControllerTest {

    @BeforeEach
    void setUp() {
        String baseUrl = "http://localhost:" + port + "/HelloName";
        RestAssured.baseURI = baseUrl;
    }

    // Inject the random port
    @Value("${local.server.port}")
    int port;

    //@BeforeEach
    //void setUp() {RestAssured.baseURI = "http://127.0.0.1:8080/HelloName";}

    @Test
    void defaultGreeting_HelloWorld_True() {
        given()
                .when()
                .get("/DefaultGreeting")
                .then()
                .statusCode(200)
                .body(equalTo("Hello World!"));
    }

    @Test
    void customGreeting_HelloTest_True() {
        given()
                .when()
                .get("/CustomGreeting/Test")
                .then()
                .statusCode(200)
                .body(equalTo("Hello TestI!"));

    }
}