package com.example.virgi.meteo.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by virgi on 30/03/2018.
 */

public class CitySingleton {

    private static CitySingleton mInstance;
    private static List<City> cityList;

    private static Context mCtx;

    private CitySingleton(Context context){
        mCtx = context;
    }

    public static synchronized CitySingleton getInstance(){
        return mInstance;
    }

    public static List<City> getCityList() {
        return cityList;
    }

    public static void setLocationList(List<City> singleLocation) {
        cityList = singleLocation;
    }

}
