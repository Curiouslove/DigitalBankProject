package com.sages.bank.entity;

import com.sages.bank.repository.SageBankCustomerDB;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(BigDecimal initialDeposit){
        setAccountNumber(SageBankCustomerDB.generateAccountNumber());
        setBalance(initialDeposit);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
