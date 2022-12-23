package com.solvd.travel.exception;

public class DayCostException extends RuntimeException{

    public DayCostException(String message){
        super (message);
    }

    public DayCostException(String message, Throwable cause){
        super(message, cause);
    }
}
