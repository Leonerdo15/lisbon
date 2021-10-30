package com.ultimate.lisbon.models;

import java.util.ArrayList;

public class Route {
    private static int nextId = 1;
    private int id;
    private String name;
    private double distance;
    private String bio;
    private ArrayList<Spot> spots;
    private ArrayList<RankComment> rankComments;

    private Route(){

    }

    public Route(String name, double distance, String bio, ArrayList<Spot> spots) {
        this.name = name;
        this.distance = distance;
        this.bio = bio;
        this.spots = spots;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<Spot> getSpots() {
        return spots;
    }

    public ArrayList<RankComment> getRankComments() {
        return rankComments;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
