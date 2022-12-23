package com.solvd.travel.people;

import com.solvd.travel.document.InsurancePolicy;
import com.solvd.travel.document.Passport;

public final class Customer extends Person {

    private String number;
    private Float rate;
    private InsurancePolicy insurancePolicy;

    public Customer(String gender, String name, String surname, Passport passport, InsurancePolicy insurancePolicy){
        super(gender, name, surname, passport);
        this.insurancePolicy=insurancePolicy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
