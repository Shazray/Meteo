package com.example.virgi.meteo.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by virgi on 30/03/2018.
 */

public class Singleton {

    private static Singleton instance;
    private static Context myContext;
    private static List<City> cityList;

    private Singleton(Context context) {
        this.myContext = context;
        List<City> cityList = new ArrayList<City>();
    }
    public static Singleton getInstance(Context context)
    {
        if (instance == null) {
            instance = new Singleton(context);
        }
        return instance;
    }

    public static List<City> getItemList() {
        return cityList;
    }

    public static void setCityList(List<City> singleCityList) {
        cityList = singleCityList;
    }



}
