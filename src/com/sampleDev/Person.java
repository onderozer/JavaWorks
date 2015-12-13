package com.sampleDev;

/**
 * Created by dedeHan on 5.12.2015.
 */
public class Person {

    private String name;

    public Person() {
        this("osman");
    }

    public Person (String name)
    {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return getName();
    }
}

