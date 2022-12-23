package com.solvd.travel.document;

import com.solvd.travel.MainClass;
import com.solvd.travel.exception.VisaValidException;
import com.solvd.travel.interfaces.Icheck;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;

public class Visa implements Icheck{

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    private String number;
    private String type;
    private String country;
    private LocalDate beginDate;
    private LocalDate endDate;

    public Visa(String number, String type, String country, LocalDate beginDate, LocalDate endDate){
        this.number=number;
        this.type=type;
        this.country=country;
        this.beginDate=beginDate;
        this.endDate=endDate;
    }

    @Override
    public void getCheck (){

        LOGGER.info("Visa checking...");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate() throws VisaValidException {
        if (endDate.isBefore(LocalDate.now())){
            throw new VisaValidException("");
        }
        this.endDate = endDate;
    }
}
