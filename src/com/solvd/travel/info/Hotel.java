package com.solvd.travel.info;

import com.solvd.travel.exception.DayCostException;

public class Hotel {

    private String name;
    private Address address;
    private Float dayCost;

    public Hotel(String name, Float dayCost) {
        if (dayCost < 0){
            throw new DayCostException("Day cost can`t be less 0 !!!");
        }
        this.name = name;
        this.dayCost = dayCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Float getDayCost() {
        return dayCost;
    }

    public void setDayCost(Float dayCost) {
        this.dayCost = dayCost;
    }
}
