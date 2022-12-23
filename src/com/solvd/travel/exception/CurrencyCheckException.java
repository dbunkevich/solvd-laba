package com.solvd.travel.exception;

public class CurrencyCheckException extends Exception{

    public CurrencyCheckException(String message){
        super (message);
    }

    public CurrencyCheckException(String message, Throwable cause){
        super(message, cause);
    }
}
