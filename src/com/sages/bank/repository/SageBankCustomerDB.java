package com.sages.bank.repository;

import com.sages.bank.entity.Customer;
import com.sages.bank.entity.RetailCustomer;

import java.util.HashMap;
import java.util.Map;

public class SageBankCustomerDB {
    private static Map<Long, Customer> bankCustomers = new HashMap<>();
    private static long currentBvn = 1000100000L;
    private static Long currentAccountNumber = Long.valueOf(0);
    private static Long currentTransactionId = Long.valueOf(0);

    static {
        Customer love = new RetailCustomer("love", "david");
        addCustomer(love);
    }

    public  static  void addCustomer(Customer newCustomer){
        bankCustomers.put(newCustomer.getBvn(), newCustomer);
    }

    public static Map<Long, Customer> getBankCustomers() {
        return bankCustomers;
    }

    private static void setBankCustomers(Map<Long, Customer> bankCustomers) {
        SageBankCustomerDB.bankCustomers = bankCustomers;
    }

    public static long generateBvn(){
        currentBvn++;
        return currentBvn;
    }

    public static long generateAccountNumber(){
        currentAccountNumber++;
        return currentAccountNumber;
    }

    public static long generateTransactionId(){
        currentTransactionId++;
        return currentTransactionId;
    }

}
