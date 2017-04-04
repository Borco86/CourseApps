package com.example.rent.dagger2_dependencyinjection;

/**
 * Created by RENT on 2017-04-04.
 */

public class SimpleObject {
    private String name;
    private SecondObject secondObject;

    public SimpleObject(String name, SecondObject secondObject) {
        this.name = name;
        this.secondObject = secondObject;
    }

    public String getName() {
        return name;
    }

    public SecondObject getSecondObject() {
        return secondObject;
    }
}
