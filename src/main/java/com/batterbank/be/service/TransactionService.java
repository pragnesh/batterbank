package com.batterbank.be.service;

import com.batterbank.be.domain.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    List<Transaction> findAllByAccountNumber(Long accountNumber, Integer numberOfTranscation) {
        ArrayList listOfTranscation = new ArrayList();
        for (int i = 0; i < numberOfTranscation; i++) {
            listOfTranscation.add(Transaction.of("test", LocalDate.now(), 1234L,
                    "USD", BigDecimal.valueOf(100), "nike", "http://nike.com/logo"));
        }
        return listOfTranscation;
    }
}
