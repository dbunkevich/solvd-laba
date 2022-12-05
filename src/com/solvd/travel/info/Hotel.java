package com.solvd.travel.info;

public class Hotel {

    private String name;
    private Address address;
    private Float dayCost;

    public Hotel(String name, Float dayCost) {
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
