package com.solvd.travel.people;

import com.solvd.travel.document.InsurancePolicy;
import com.solvd.travel.document.Passport;

public final class Employee extends Person {

    private String jobTitle;

    public Employee (String gender, String name, String surname, Passport passport, String jobTitle){
        super(gender, name, surname, passport);
        this.jobTitle=jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
