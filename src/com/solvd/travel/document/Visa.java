package com.solvd.travel.document;

import java.time.LocalDate;

public class Visa {

    private String number;
    private String type;
    private String country;
    private LocalDate beginDate;
    private LocalDate endDate;

    public Visa(String number, String type, String country, LocalDate beginDate, LocalDate endDate){
        this.number=number;
        this.type=type;
        this.country=country;
        this.beginDate=beginDate;
        this.endDate=endDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
