package com.solvd.travel.info;

abstract class WeatherForecast {

    private Float airTemp;
    private Float waterTemp;
    private String wind;
    private Float airPressure;
    private Float ufIndex;

    public WeatherForecast (Float airTemp, Float waterTemp, String wind, Float airPressure, Float ufIndex){
    }

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
