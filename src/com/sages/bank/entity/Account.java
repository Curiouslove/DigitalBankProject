package com.sages.bank.entity;

import com.sages.bank.enums.TransactionType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private long accountNumber;

    private BigDecimal balance;
    private List<Transaction> transactionList = new ArrayList<>();

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    private void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(Transaction tx){
        if (tx != null && tx.getType().equals(TransactionType.CREDIT)){
            BigDecimal newBalance = balance.add(tx.getAmount());
        }
        transactionList.add(tx);

    }
}
