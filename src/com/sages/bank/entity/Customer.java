package com.sages.bank.entity;

import com.sages.bank.repository.SageBankCustomerDB;

public abstract class Customer {
    private long bvn;
    private String firstName;
    private String LastName;
    private String email;
    private String password;


    public long getBvn() {
        return bvn;
    }

    public void setBvn(long bvn) {
        this.bvn = bvn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
