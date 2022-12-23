package com.solvd.travel.info;

import com.solvd.travel.MainClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Address {

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    private Integer postalCode;
    private String country;
    private String city;
    private String street;
    private String apt;

    public Address(Integer postalCode, String country, String city, String street, String apt) {
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.apt = apt;
    }

    public static List<String> cities = new LinkedList<>();

    public static void printCities(){
        LOGGER.info(cities);
    }

    @Override
    public String toString() {
        return "Address{" +
                "postalCode=" + postalCode +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apt='" + apt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getPostalCode().equals(address.getPostalCode()) && getCountry().equals(address.getCountry()) && getCity().equals(address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostalCode(), getCountry(), getCity());
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }
}
