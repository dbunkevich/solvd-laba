package com.solvd.travel.exception;

public class VisaValidException extends Exception {

    public VisaValidException(String message){
        super (message);
    }

    public VisaValidException(String message, Throwable cause){
        super(message, cause);
    }
}
