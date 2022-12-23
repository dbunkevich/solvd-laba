package com.solvd.travel.route;

import com.solvd.travel.MainClass;
import com.solvd.travel.info.Hotel;
import com.solvd.travel.info.Language;
import com.solvd.travel.info.ScannerData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlaceOfTravel {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    private String name;
    private Hotel[] hotels;
    private Language language;

    public static final void placeOfTravel(PlaceOfTravel[] placeOfTravels){
        int count = 0;

        for (int i=0; i< placeOfTravels.length; i++) {
            if (placeOfTravels[i].getName().equals(ScannerData.getPlaceOfTravel())) {
                for (int j = 0; j < placeOfTravels[i].getHotels().length; j++) {
                    if (((placeOfTravels[i].getHotels()[j].getDayCost()) * (Float.parseFloat(ScannerData.getNumberOfDaysTravel()))) < (Float.parseFloat(ScannerData.getBudget()))) {
                        LOGGER.info("Place have founded !");
                        LOGGER.info("Place - " + placeOfTravels[i].getName());
                        LOGGER.info("Hotel - " + placeOfTravels[i].getHotels()[j].getName());
                        LOGGER.info("Days - " + ScannerData.getNumberOfDaysTravel());
                        LOGGER.info("Cost - " + (Float.parseFloat(ScannerData.getNumberOfDaysTravel())*(placeOfTravels[i].getHotels()[j].getDayCost())));
                        LOGGER.info("Official language is - " + placeOfTravels[i].getLanguage().toString());
                        LOGGER.info("");
                        count = 1;
                    }
                }
            }
        }
        if (count == 0) {
            LOGGER.info("Place have not founded !");
        }
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

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
