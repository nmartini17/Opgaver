package com.company;

import java.sql.*;
import java.util.*;

public class MainController {
    List<City> cities;

    public MainController() {
        cities = new ArrayList<>();
    }

    public void runProgram() {
        getMyConnection();
        printConnection();
        printCityCount();
        printBigCities();
        populateCityList();
        printCitiesList();
    }

    private void printCitiesList() {
        for (City c : cities) {
            System.out.println(c);
        }
    }


    public Connection getMyConnection() {
        Connection connection = null;
        String urlSettings = "?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
        String url = "jdbc:mysql://localhost:3306/world";
        String userName = "root";
        String password = "password";

        try {
            connection = DriverManager.getConnection(
                    url + urlSettings,
                    userName,
                    password
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void printConnection() {
        if (getMyConnection() != null) {
            System.out.println("There is a connection");
        }
    }

    public void printCityCount() {
        Connection connection = null;
        Statement stmt = null;
        ResultSet res = null;
        int total = 1;

        String sql = "";

        connection = getMyConnection();
        try {
            stmt = connection.createStatement();
            sql = "SELECT COUNT(*) from city";
            res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getInt(total));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printBigCities() {
        Connection connection = null;
        Statement stat = null;
        ResultSet res = null;

        String sql = "";

        connection = getMyConnection();
        try {
            stat = connection.createStatement();
            sql = "SELECT * FROM city WHERE Population > 5000000";
            res = stat.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getString("Name"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void populateCityList() {
        Connection connection = null;
        Statement stat = null;
        ResultSet res = null;

        String sql = "";
        City tmpCity = null;

        connection = getMyConnection();
        try {
            stat = connection.createStatement();
            sql = "SELECT * FROM city";
            res = stat.executeQuery(sql);
            while(res.next()) {
                int id = res.getInt("ID");
                String name = res.getString("Name");
                String countryCode = res.getString("CountryCode");
                int population = res.getInt("Population");
                tmpCity = new City(id,name,countryCode,population);
                cities.add(tmpCity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
