package com.example.virgi.meteo.data;

import java.io.Serializable;

/**
 * Created by virgi on 30/03/2018.
 */

public class ForecastOutput implements Serializable {

    private String main;
    private String description;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ForecastOutput{" +
                "main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
