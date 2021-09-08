package com.sages.bank.repository;

import com.sages.bank.entity.Customer;
import com.sages.bank.entity.RetailCustomer;
import com.sages.bank.services.CustomerServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SageBankCustomerDBTest {
    private Customer customer;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void addCustomer(){
        assertFalse(SageBankCustomerDB.getBankCustomers().isEmpty());
        Customer customer = new RetailCustomer("john","johnson");
        SageBankCustomerDB.addCustomer(customer);
        assertFalse(SageBankCustomerDB.getBankCustomers().isEmpty());
        assertEquals(4,SageBankCustomerDB.getBankCustomers().size());

    }
}