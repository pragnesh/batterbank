package com.batterbank.be.web;

import com.batterbank.be.service.TransactionService;
import io.restassured.module.mockmvc.response.MockMvcResponse;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static io.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionComponentTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    TransactionService transactionService;

    @Test
    void testGetTransactionEtoE() throws Exception {
        String response =
                given().
                standaloneSetup(new TransactionController(transactionService)).
        when().
                get("/api/v1/transactions/{accountNumber}", "100").
        then().
                statusCode(200).
        extract().
                 response().asString();
        List<String> transctions = JsonPath.from(response).get("it.findAll { true }");
        Assertions.assertEquals(10, transctions.size());
    }
}
