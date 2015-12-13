package com.java.Chapter8.sample.development;

import java.io.*;

/**
 * Created by dedeHan on 9.12.2015.
 */
public class Resident implements Serializable{

    private String name;
    private String room;
    private String password;

    public Resident() {
        this("unassigned","000","XXXYYYZZ");
    }

    public Resident(String name, String room, String password) {
        setName(name);
        setRoom(room);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int lenght = password.length();

        if (lenght < 8) {
            throw new IllegalArgumentException();
        } else {
            this.password = password;
        }


    }
}
