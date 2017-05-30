package com.example.a15056233.taskmanager;

import java.io.Serializable;

/**
 * Created by 15056233 on 30/5/2017.
 */

public class Tasks implements Serializable {

    private int id;
    private String name;
    private String descr;

    public Tasks(int id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
    }

    public int getId() {return id;}

    public String getName() {return name;}

    public String getDescr() { return descr;}
}
