package com.company;

public class City {
    private int id;
    private String name;
    private String countryCode;
    private int population;

    public City(int id, String name, String countryCode, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +"\t" + "Name:" + getName() + "\t" + "Country code:" + getCountryCode() + "\t" + "Population:" + getPopulation() + "\t";
    }
}
