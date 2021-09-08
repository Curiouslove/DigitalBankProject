package com.sages.bank.exceptions;

public class SageBankTransactionException extends SageBankException{
    public SageBankTransactionException() {
    }

    public SageBankTransactionException(String message) {
        super(message);
    }

    public SageBankTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public SageBankTransactionException(Throwable cause) {
        super(cause);
    }
}
