package com.solvd.travel.route;

import com.solvd.travel.people.Customer;

public class Route {

    private String name;
    private Integer distance;
    private PlaceOfTravel[] travelPoints;
    private Customer[] customers;
    private Float cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public PlaceOfTravel[] getTravelPoints() {
        return travelPoints;
    }

    public void setTravelPoints(PlaceOfTravel[] travelPoints) {
        this.travelPoints = travelPoints;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
