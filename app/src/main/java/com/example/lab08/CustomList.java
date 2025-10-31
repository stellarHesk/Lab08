package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    //This is a comment
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city){
        //Delete the city
        boolean deleted = cities.remove(city);
        if (!deleted){
            throw new IllegalArgumentException();
        }
    }

    public int countCities(){
        return cities.size();
    }

}
