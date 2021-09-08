package com.sages.bank.services;

import com.sages.bank.entity.Account;
import com.sages.bank.entity.Customer;
import com.sages.bank.entity.RetailCustomer;
import com.sages.bank.entity.SavingsAccount;
import com.sages.bank.exceptions.SageBankException;
import com.sages.bank.repository.SageBankCustomerDB;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    private  CustomerService customerService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        customerService = new CustomerServiceImpl();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void findCustomer() throws SageBankException {
        BigDecimal lovebvn = new BigDecimal(1000100001L);
        try {
            Customer love = customerService.findCustomer(lovebvn.longValue());
            assertNotNull(love);
        }catch (SageBankException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void findCustomerWithInvalidBVN(){
        assertThrows(SageBankException.class,
                () -> customerService.findCustomer(355488L));
    }

    @Test
    void openAccountWithNullCustomer(){
        assertThrows(SageBankException.class,
                ()->customerService.openAccount(null,new SavingsAccount(BigDecimal.ZERO)));
    }

    @Test
    void openAccountWithNullAccount(){
        Customer john = new RetailCustomer("ise","fashoyin");
        assertThrows(SageBankException.class,
                ()->customerService.openAccount(john,null));
    }

    @Test
    void openAccount(){
        BigDecimal iseBvn = new BigDecimal(10001100001L);
        try {
            Customer ise = customerService.findCustomer(iseBvn.longValue());
            assertNotNull(ise);
            Account iseSavings = new SavingsAccount(BigDecimal.valueOf(500000));
        } catch (SageBankException e) {
            e.printStackTrace();
        }
    }


}