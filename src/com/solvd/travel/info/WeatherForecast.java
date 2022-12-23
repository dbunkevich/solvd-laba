package com.solvd.travel.info;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WeatherForecast {

    private Float airTemp;
    private Float waterTemp;
    private String wind;
    private Float airPressure;
    private Float ufIndex;

    public WeatherForecast(Float airTemp, Float waterTemp, String wind, Float airPressure, Float ufIndex) {
        this.airTemp = airTemp;
        this.waterTemp = waterTemp;
        this.wind = wind;
        this.airPressure = airPressure;
        this.ufIndex = ufIndex;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "airTemp=" + airTemp +
                ", waterTemp=" + waterTemp +
                ", wind='" + wind + '\'' +
                ", airPressure=" + airPressure +
                ", ufIndex=" + ufIndex +
                '}';
    }

    public static List<WeatherForecast> weatherForecasts= new ArrayList<>();

    public Float getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(Float airTemp) {
        this.airTemp = airTemp;
    }

    public Float getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(Float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public Float getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(Float airPressure) {
        this.airPressure = airPressure;
    }

    public Float getUfIndex() {
        return ufIndex;
    }

    public void setUfIndex(Float ufIndex) {
        this.ufIndex = ufIndex;
    }
}
