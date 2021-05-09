package com.batterbank.be.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String type;

    private LocalDate date;

    private Long accountNumber;

    private String currency;

    private BigDecimal amount;

    private String merchantName;

    private String merchantLogo;

}
