package com.sages.bank.entity;

import com.sages.bank.repository.SageBankCustomerDB;

public class RetailCustomer extends Customer{
    public RetailCustomer(String fname, String lname){
        setBvn(SageBankCustomerDB.generateBvn());
        setFirstName(fname);
        setLastName(lname);
    }

    public RetailCustomer(long customerBvn, String fname, String lname){
        this(fname, lname);
        setBvn(customerBvn);
    }

    public RetailCustomer(long customerBvn, String fname, String lname, String email){
        this(fname, lname);
        setBvn(customerBvn);
        setEmail(email);
    }
}
