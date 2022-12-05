package com.solvd.travel.info;

public class ScannerData {

    private static String nameOfClient;
    private static String surnameOfClient;
    private static String placeOfTravel;
    private static String numberOfDaysTravel;
    private static String budget;
    private static String currency;

    @Override
    public String toString() {
        return "ScannerData{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static String getNameOfClient() {
        return nameOfClient;
    }

    public static void setNameOfClient(String nameOfClient) {
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
