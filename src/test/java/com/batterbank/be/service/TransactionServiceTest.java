package com.batterbank.be.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {

    @Autowired
    TransactionService transactionService;

    @Test
    void testFindAllByAccountNumber() {
        Assertions.assertTrue(transactionService.findAllByAccountNumber(100L).size() > 0);
    }
}
