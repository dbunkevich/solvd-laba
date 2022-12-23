package com.solvd.travel.info;

import com.solvd.travel.exception.CurrencyCheckException;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Currency {

    private String code;
    private String name;
    private Float rate;

    public static Map<Integer, String> currencies = new TreeMap<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CurrencyCheckException {
        if (name.length() !=3) {
            throw new CurrencyCheckException("");
        }
        this.name = name;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
