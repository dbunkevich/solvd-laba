package com.solvd.travel.info;

import com.solvd.travel.exception.NameCheckException;

public class ScannerData {

    private static String nameOfClient;
    private static String surnameOfClient;
    private static String placeOfTravel;
    private static String numberOfDaysTravel;
    private static String budget;
    private static String currency;


    public static String getNameOfClient() {
        return nameOfClient;
    }

    public static void setNameOfClient(String nameOfClient){
        if (nameOfClient.contains("0") | nameOfClient.contains("1") | nameOfClient.contains("2") | nameOfClient.contains("3") | nameOfClient.contains("4") | nameOfClient.contains("5") | nameOfClient.contains("6") | nameOfClient.contains("7") | nameOfClient.contains("8") | nameOfClient.contains("9")){
            throw new NameCheckException("Name can`t contain a digit !!!");
        }
        ScannerData.nameOfClient = nameOfClient;
    }

    public static String getSurnameOfClient() {
        return surnameOfClient;
    }

    public static void setSurnameOfClient(String surnameOfClient) {
        ScannerData.surnameOfClient = surnameOfClient;
    }

    public static String getPlaceOfTravel() {
        return placeOfTravel;
    }

    public static void setPlaceOfTravel(String placeOfTravel) {
        ScannerData.placeOfTravel = placeOfTravel;
    }

    public static String getNumberOfDaysTravel() {
        return numberOfDaysTravel;
    }

    public static void setNumberOfDaysTravel(String numberOfDaysTravel) {
        ScannerData.numberOfDaysTravel = numberOfDaysTravel;
    }

    public static String getBudget() {
        return budget;
    }

    public static void setBudget(String budget) {
        ScannerData.budget = budget;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        ScannerData.currency = currency;
    }
}
