package com.ultimate.lisbon.models;

import java.util.ArrayList;

public class Spot {
    private static int nextId = 1;
    private int id;
    private String name;
    private double lat;
    private double log;
    private String bio;
    private ArrayList<Tag> tags;
    private ArrayList<RankComment> rank;
    private ArrayList<RankComment> comments;

    public Spot(String name, double lat, double log, String bio) {
        this.name = name;
        this.lat = lat;
        this.log = log;
        this.bio = bio;
    }

    public Spot(String name, double lat, double log, String bio, ArrayList<Tag> tags) {
        this.name = name;
        this.lat = lat;
        this.log = log;
        this.tags = tags;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLog() {
        return log;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public ArrayList<RankComment> getRank() {
        return rank;
    }

    public ArrayList<RankComment> getComments() {
        return comments;
    }

    public void setRank(ArrayList<RankComment> rank) {
        this.rank = rank;
    }

    public void setComments(ArrayList<RankComment> comments) {
        this.comments = comments;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


    // Ver se assim eu estou a criar novas tags e eu nao quero criar novas tags
    public void addTag(String tag){
        this.tags.add(new Tag(tag, 2));
    }

    public void addTags(ArrayList<String> tag){
        for (String s : tag) {
            tags.add(new Tag(s, 2));
        }
    }

    public void addRank(int rank){
        this.rank.add(new RankComment(rank));
    }

    // Meto o rank daqui no so de rank para ter o rank todos?
    public void addComment(int rank, String comment){
        this.rank.add(new RankComment(rank, comment));
    }
}
