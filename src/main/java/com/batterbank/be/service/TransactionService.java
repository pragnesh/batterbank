package com.batterbank.be.service;

import com.batterbank.be.domain.Transaction;
import com.batterbank.be.repositery.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAllByAccountNumber(Long accountNumber) {
        return transactionRepository.findByAccountNumber(accountNumber);
    }
}
