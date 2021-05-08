package com.batterbank.be.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor(staticName = "of")
public class Transaction {

    private final String type;

    private final LocalDate date;

    private final Long accountNumber;

    private final String currency;

    private final BigDecimal amount;

    private final String merchantName;

    private final String merchantLogo;
}
