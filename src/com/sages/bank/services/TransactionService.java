package com.sages.bank.services;

import com.sages.bank.entity.Account;
import com.sages.bank.entity.Transaction;
import com.sages.bank.exceptions.SageBankTransactionException;

import java.math.BigDecimal;

public interface TransactionService {
    BigDecimal addTransaction(Account account, Transaction tx) throws SageBankTransactionException;
}
