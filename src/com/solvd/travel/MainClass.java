package com.solvd.travel;

import com.solvd.travel.info.Hotel;
import com.solvd.travel.info.ScannerData;
import com.solvd.travel.route.PlaceOfTravel;
import com.solvd.travel.utils.InputUtils;

public class MainClass {

    public static void main(String[] Args) {

        Hotel radissonMadrid = new Hotel("RadissonMadrid", 165f);
        Hotel hiltonMadrid = new Hotel("HiltonMadrid", 125.3f);
        Hotel holidayinnMadrid = new Hotel("HolidayInnMadrid", 138.32f);
        Hotel[] hMadrid = new Hotel[]{radissonMadrid, hiltonMadrid, holidayinnMadrid};
        PlaceOfTravel a = new PlaceOfTravel();
        a.setName("Madrid");
        a.setHotels(hMadrid);
        Hotel radissonBerlin = new Hotel("RadissonBerlin", 137f);
        Hotel hiltonBerlin = new Hotel("HiltonBerlin", 121.35f);
        Hotel holidayinnBerlin = new Hotel("HolidayInnBerlin", 128.24f);
        Hotel[] hBerlin = new Hotel[]{radissonBerlin, hiltonBerlin, holidayinnBerlin};
        PlaceOfTravel b = new PlaceOfTravel();
        b.setName("Berlin");
        b.setHotels(hBerlin);
        PlaceOfTravel[] placeOfTravels = new PlaceOfTravel[]{a, b};

        InputUtils.inputData();

        int count = 0;

        for (int i=0; i< placeOfTravels.length; i++) {
            if (placeOfTravels[i].getName().equals(ScannerData.getPlaceOfTravel())) {
                for (int j = 0; j < placeOfTravels[i].getHotels().length; j++) {
                    if (((placeOfTravels[i].getHotels()[j].getDayCost()) * (Float.parseFloat(ScannerData.getNumberOfDaysTravel()))) < (Float.parseFloat(ScannerData.getBudget()))) {
                        System.out.println("Place have founded !");
                        System.out.println("Place -" + placeOfTravels[i].getName());
                        System.out.println("Hotel -" + placeOfTravels[i].getHotels()[j].getName());
                        System.out.println();
                        count = 1;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Place have not founded !");
        }
    }
}
