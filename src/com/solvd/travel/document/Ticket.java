package com.solvd.travel.document;

import java.time.LocalDate;

public class Ticket {

    private String number;
    private String type;
    private LocalDate date;
    private Float cost;

    public Ticket(String number, String type, LocalDate date, Float cost){
        this.number=number;
        this.type=type;
        this.date=date;
        this.cost=cost;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
