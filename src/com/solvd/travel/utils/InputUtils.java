package com.solvd.travel.utils;

import com.solvd.travel.MainClass;
import com.solvd.travel.info.ScannerData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils{

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    private static String nameOfClient;
    private static String surnameOfClient;
    private static String placeOfTravel;
    private static String numberOfDaysTravel;
    private static String budget;
    private static String currency;

    public static ScannerData inputData() {

        ScannerData currentData = new ScannerData();

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter name of Client : ");
        String nameOfClient = scanner.nextLine();
        ScannerData.setNameOfClient(nameOfClient);
        LOGGER.info("Enter surname of Client : ");
        String surnameOfClient = scanner.nextLine();
        ScannerData.setSurnameOfClient(surnameOfClient);
        LOGGER.info("Enter place of travel : ");
        String placeOfTravel = scanner.nextLine();
        ScannerData.setPlaceOfTravel(placeOfTravel);
        LOGGER.info("Enter number of days travel : ");
        String numberOfDaysTravel = scanner.nextLine();
        ScannerData.setNumberOfDaysTravel(numberOfDaysTravel);
        LOGGER.info("Enter budget : ");
        String budget = scanner.nextLine();
        ScannerData.setBudget(budget);
        LOGGER.info("Enter currency : ");
        String currency = scanner.nextLine();
        ScannerData.setCurrency(currency);
        LOGGER.info("");

        return currentData;

    }
}
