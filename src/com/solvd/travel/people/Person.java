package com.solvd.travel.people;

import com.solvd.travel.document.Passport;
import com.solvd.travel.info.Address;

import java.util.Objects;

public class Person extends Human {

    private String name;
    private String surname;
    private Passport passport;
    private Address adress;

    public Person( String gender, String name, String surname, Passport passport){
        super(gender);
        this.name=name;
        this.surname=surname;
        this.passport=passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport=" + passport +
                ", adress=" + adress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName()) && getSurname().equals(person.getSurname()) && getPassport().equals(person.getPassport()) && getAdress().equals(person.getAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPassport(), getAdress());
    }

    @Override
    void idHuman(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }


}
