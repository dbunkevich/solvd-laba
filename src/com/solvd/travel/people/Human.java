package com.solvd.travel.people;

abstract class Human {
    private String gender;
    private String bloodType;

    abstract void idHuman();

    public Human(String gender){
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
