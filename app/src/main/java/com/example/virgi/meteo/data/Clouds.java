package com.example.virgi.meteo.data;

/**
 * Created by virgi on 30/03/2018.
 */

public class Clouds {

    private String all;

    public Clouds(String all) {
        this.all = all;
    }


    @Override
    public String toString() {
        return "Clouds{" +
                "all='" + all + '\'' +
                '}';
    }

    public String getAll() {
        return all;
    }
}
