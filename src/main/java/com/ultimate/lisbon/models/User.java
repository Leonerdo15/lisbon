package com.ultimate.lisbon.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private static int nextId = 0;
    private int id;
    private String name;
    private LocalDate bDate;
    private String gender;
    private String country;
    private String bio;
    private ArrayList<Route> favoriteRoutes;
    private ArrayList<Spot> favoriteSpots;
    private ArrayList<RankComment> rankComments;

    public User(){
    }

    public User(String name, LocalDate bDate, String gender, String country, String bio) {
        this.id = nextId;
        this.name = name;
        this.bDate = bDate;
        this.gender = gender;
        this.country = country;
        this.bio = bio;
        nextId++;
    }

    public User(String name, LocalDate bDate, String gender) {
        this.id = nextId;
        this.name = name;
        this.bDate = bDate;
        this.gender = gender;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getbDate() {
        return bDate;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<Route> getFavoriteRoutes() {
        return favoriteRoutes;
    }

    public ArrayList<Spot> getFavoriteSpots() {
        return favoriteSpots;
    }

    public ArrayList<RankComment> getRankComments() {
        return rankComments;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setFavoriteRoutes(ArrayList<Route> favoriteRoutes) {
        this.favoriteRoutes = favoriteRoutes;
    }

    public void setFavoriteSpots(ArrayList<Spot> favoriteSpots) {
        this.favoriteSpots = favoriteSpots;
    }

    public void setRankComments(ArrayList<RankComment> rankComments) {
        this.rankComments = rankComments;
    }


}
