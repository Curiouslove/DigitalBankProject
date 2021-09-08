package com.sages.bank.entity;

import com.sages.bank.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private long id;
    private LocalDateTime txDate;
    private BigDecimal amount;
    private TransactionType type;

    public Transaction(BigDecimal txAmount,TransactionType type){
        txDate = LocalDateTime.now();
        this.amount = txAmount;
        this.type = type;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTxDate() {
        return txDate;
    }

    public void setTxDate(LocalDateTime txDate) {
        this.txDate = txDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
