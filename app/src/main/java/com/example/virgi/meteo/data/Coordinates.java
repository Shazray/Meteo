package com.example.virgi.meteo.data;

/**
 * Created by virgi on 30/03/2018.
 */

public class Coordinates {

    private float lon;
    private float lat;

    public Coordinates(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }
}

