package com.solvd.travel.info;

import com.solvd.travel.people.Person;

import java.util.Objects;

public enum Language {

    BERLIN("Berlin", "deutsch"), MADRID("Madrid", "spanish"), LONDON("London", "english");

    private final String name;
    private final String lang;

    Language (String name, String lang){
        this.name=name;
        this.lang=lang;
    }

    @Override
    public String toString() {
        return lang;
    }
}
