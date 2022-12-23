package com.solvd.travel.exception;

public class NameCheckException extends RuntimeException{

    public NameCheckException(String message){
        super (message);
    }

    public NameCheckException(String message, Throwable cause){
        super(message, cause);
    }
}
