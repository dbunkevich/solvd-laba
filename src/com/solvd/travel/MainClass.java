package com.solvd.travel;

import com.solvd.travel.data.InsertData;
import com.solvd.travel.document.Visa;
import com.solvd.travel.exception.*;
import com.solvd.travel.info.*;
import com.solvd.travel.route.PlaceOfTravel;
import com.solvd.travel.utils.InputUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.solvd.travel.document.InsurancePolicy.policies;
import static com.solvd.travel.info.Address.cities;
import static com.solvd.travel.info.Currency.currencies;
import static com.solvd.travel.info.Email.emails;
import static com.solvd.travel.info.WeatherForecast.weatherForecasts;

public class MainClass {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    public static void main(String[] Args) {

        LOGGER.info("info");

        Hotel radissonMadrid = new Hotel("RadissonMadrid", 165f);
        Hotel hiltonMadrid = new Hotel("HiltonMadrid", 125.3f);
        Hotel holidayinnMadrid = new Hotel("HolidayInnMadrid", 138.32f);
        Hotel[] hMadrid = new Hotel[]{radissonMadrid, hiltonMadrid, holidayinnMadrid};
        PlaceOfTravel a = new PlaceOfTravel();
        a.setName("Madrid");
        a.setHotels(hMadrid);
        a.setLanguage(Language.MADRID);
        Hotel radissonBerlin = new Hotel("RadissonBerlin", 137f);
        Hotel hiltonBerlin = new Hotel("HiltonBerlin", 121.35f);
        Hotel holidayinnBerlin = new Hotel("HolidayInnBerlin", 128.24f);
        Hotel[] hBerlin = new Hotel[]{radissonBerlin, hiltonBerlin, holidayinnBerlin};
        PlaceOfTravel b = new PlaceOfTravel();
        b.setName("Berlin");
        b.setHotels(hBerlin);
        b.setLanguage(Language.BERLIN);
        Hotel radissonLondon = new Hotel("RadissonLondon", 115f);
        Hotel hiltonLondon = new Hotel("HiltonLondon", 140.67f);
        Hotel holidayinnLondon = new Hotel("HolidayInnLondon", 168.21f);
        Hotel[] hLondon = new Hotel[]{radissonLondon, hiltonLondon, holidayinnLondon};
        PlaceOfTravel c = new PlaceOfTravel();
        c.setName("London");
        c.setHotels(hLondon);
        c.setLanguage(Language.LONDON);
        PlaceOfTravel[] placeOfTravels = new PlaceOfTravel[]{a, b, c};

        cities.add("Madrid");
        cities.add("Berlin");
        cities.add("London");

        policies.add("IP00012345");
        policies.add("IP00012343");
        policies.add("IP00012346");
        policies.add("IP00012342");
        policies.add("IP00012341");

        currencies.put(234, "USD");
        currencies.put(254, "EUR");
        currencies.put(532, "BYR");
        currencies.put(112, "UAH");
        currencies.put(278, "GBP");

        emails.add("YAHOO");
        emails.add("GMAIL");
        emails.add("MAIL.RU");
        emails.add("YANDEX");

        Email email1 = new Email();
        email1.setNameOfService("GMAIL");
        LOGGER.info(email1);
        try {
            email1.setNameOfEmail("db.gmail.com");
        } catch (EmailCheckException e){
            LOGGER.info("Email name is wrong !!!");
        } finally {
            LOGGER.info("Email name was checked !!!");
        }

        Visa visa1 = new Visa("E1256", "MULTI", "EU", LocalDate.of(2022,10,15), LocalDate.of(2022, 10, 16));
        try {
            visa1.setEndDate();
        } catch (VisaValidException e){
            LOGGER.info("Visa is not valid !!!");
        } finally {
            LOGGER.info("Visa validation was checked !!!");
        }

        Currency usd = new Currency();
        try {
            usd.setName("USDT");
        } catch (CurrencyCheckException e){
            LOGGER.info("Currency name need to has 3 symbols !!!");
        }

        WeatherForecast weatherForecastBerlin = new WeatherForecast(23.4f,20.2f, "NW", 780f,6.54f);
        WeatherForecast weatherForecastMadrid = new WeatherForecast(26.5f,24.1f, "SE", 1080f,8.54f);
        WeatherForecast weatherForecastLondon = new WeatherForecast(18.8f,17.6f, "NNW", 965f,4.42f);
        weatherForecasts.add(weatherForecastBerlin);
        weatherForecasts.add(weatherForecastMadrid);
        weatherForecasts.add(weatherForecastLondon);



        visa1.getCheck();

        InputUtils.inputData();

        InsertData.insData.add(ScannerData.getSurnameOfClient());
        InsertData.insData.add(ScannerData.getNameOfClient());
        InsertData.insData.add(ScannerData.getPlaceOfTravel());
        InsertData.insData.add(ScannerData.getNumberOfDaysTravel());
        InsertData.insData.add(ScannerData.getCurrency());

        PlaceOfTravel.placeOfTravel(placeOfTravels);

        LOGGER.info(InsertData.insData);

        Address.printCities();

        LOGGER.info(policies);

        LOGGER.info(currencies);

        LOGGER.info(weatherForecasts);
    }
}
