package com.batterbank.be.repositery;

import com.batterbank.be.domain.Transaction;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    @Cacheable("transaction")
    List<Transaction> findByAccountNumber(Long accountNumber);
}