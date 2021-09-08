package com.sages.bank.exceptions;


public class SageBankException extends  Exception{
    public SageBankException(){

    }

    public SageBankException(String message){
        super(message);
    }

    public SageBankException(String message, Throwable ex){
        super(message, ex);
    }

    public SageBankException(Throwable ex){
        super(ex);
    }

}
