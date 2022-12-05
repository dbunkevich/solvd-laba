package com.solvd.travel.utils;

import com.solvd.travel.info.ScannerData;

import java.util.Scanner;

public class InputUtils {
    private static String nameOfClient;
    private static String surnameOfClient;
    private static String placeOfTravel;
    private static String numberOfDaysTravel;
    private static String budget;
    private static String currency;

    public static ScannerData inputData() {

        ScannerData currentData = new ScannerData();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of Client : ");
        String nameOfClient = scanner.nextLine();
        ScannerData.setNameOfClient(nameOfClient);
        System.out.print("Enter surname of Client : ");
        String surnameOfClient = scanner.nextLine();
        ScannerData.setSurnameOfClient(surnameOfClient);
        System.out.print("Enter place of travel : ");
        String placeOfTravel = scanner.nextLine();
        ScannerData.setPlaceOfTravel(placeOfTravel);
        System.out.print("Enter number of days travel : ");
        String numberOfDaysTravel = scanner.nextLine();
        ScannerData.setNumberOfDaysTravel(numberOfDaysTravel);
        System.out.print("Enter budget : ");
        String budget = scanner.nextLine();
        ScannerData.setBudget(budget);
        System.out.print("Enter currency : ");
        String currency = scanner.nextLine();
        ScannerData.setCurrency(currency);

        return currentData;

    }
}
