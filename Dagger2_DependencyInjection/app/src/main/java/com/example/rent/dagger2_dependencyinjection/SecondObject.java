package com.example.rent.dagger2_dependencyinjection;

/**
 * Created by RENT on 2017-04-04.
 */

public class SecondObject {
    private String secondName;

    public SecondObject(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }
}
