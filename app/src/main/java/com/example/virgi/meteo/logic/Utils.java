package com.example.virgi.meteo.logic;

import com.example.virgi.meteo.data.City;
import com.example.virgi.meteo.data.CitySingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by virgi on 30/03/2018.
 */

public class Utils {

    public static void init(){
        List<City> city = new ArrayList<City>();
        city.add(new City("Milano"));
        city.add(new City("Roma"));
        city.add(new City("Firenze"));
        CitySingleton.getInstance().setLocationList(city);
    }

    public static List<City> getCityList(){
        return CitySingleton.getInstance().getCityList();
    }

    public static void addCity (City city){
        CitySingleton.getInstance().getCityList().add(city);
    }
}
