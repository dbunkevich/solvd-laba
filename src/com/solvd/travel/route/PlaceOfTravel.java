package com.solvd.travel.route;

import com.solvd.travel.info.Hotel;

public class PlaceOfTravel {

    private String name;
    private Hotel[] hotels;

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
