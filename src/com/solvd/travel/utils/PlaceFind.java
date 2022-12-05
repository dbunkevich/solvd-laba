package com.solvd.travel.utils;

import com.solvd.travel.info.ScannerData;
import com.solvd.travel.route.PlaceOfTravel;

public class PlaceFind {

    private String inputPlace;
    private Float inputBudget;
    private String[] arrPlace;

    PlaceFind p = new PlaceFind();

    public String getInputPlace() {
        return inputPlace;
    }

    public void setInputPlace(String inputPlace) {
        this.inputPlace = inputPlace;
    }

    public Float getInputBudget() {
        return inputBudget;
    }

    public void setInputBudget(Float inputBudget) {
        this.inputBudget = inputBudget;
    }

    public String[] getArrPlace() {
        return arrPlace;
    }

    public void setArrPlace(String[] arrPlace) {
        this.arrPlace = arrPlace;
    }
}
