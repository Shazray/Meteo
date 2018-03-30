package com.example.virgi.meteo.data;

import java.util.List;

/**
 * Created by virgi on 30/03/2018.
 */

public class City {

    private String id;
    private String name;
    private List<ForecastOutput> weather;

    public City(String name) {
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public List<ForecastOutput> getWeather() {
        return weather;
    }

    public void setWeather(List<ForecastOutput> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "WeatherOutput{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weather=" + weather +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
