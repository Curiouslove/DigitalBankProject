package com.sages.bank.services;

import com.sages.bank.entity.Account;
import com.sages.bank.entity.Customer;
import com.sages.bank.exceptions.SageBankException;
import com.sages.bank.repository.SageBankCustomerDB;

public interface CustomerService {
    Customer findCustomer(Long bvn) throws SageBankException;
    Customer openAccount(Customer customer, Account account) throws SageBankException;
}
