package com.solvd.travel.info;

import java.time.LocalDate;

public class PlaceWeatherForecast extends WeatherForecast{

    private String placeName;
    private LocalDate date;

    public PlaceWeatherForecast(Float airTemp, Float waterTemp, String wind, Float airPressure, Float ufIndex, String placeName, LocalDate date){
        super(airTemp, waterTemp, wind, airPressure, ufIndex);
        this.placeName=placeName;
        this.date=date;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
