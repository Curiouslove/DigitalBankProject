package com.sages.bank.services;

import com.sages.bank.entity.Account;
import com.sages.bank.entity.Customer;
import com.sages.bank.exceptions.SageBankException;
import com.sages.bank.repository.SageBankCustomerDB;

public class CustomerServiceImpl  implements CustomerService {

    @Override
    public Customer findCustomer(Long bvn) throws SageBankException {
        Customer foundCustomer = SageBankCustomerDB.getBankCustomers().get(bvn);
        if (foundCustomer == null){
            throw new SageBankException("Customer not found");
        }

        return foundCustomer;
    }

    @Override
    public Customer openAccount(Customer customer, Account account) throws SageBankException {
        if(customer == null || account == null){
            throw new SageBankException("You need a customer and account details to open a new account");
        }
        return null;
    }
}
