package com.ultimate.lisbon.models;

public class RankComment {
    private static int nextId = 1;
    private int id;
    private int rank;
    private String comment;

    // If the user wants to comment has to rank first
    public RankComment(int rank, String comment) {
        this.id = nextId;
        this.rank = rank;
        this.comment = comment;
        nextId ++;
    }

    public RankComment(int rank) {
        this.id = nextId;
        this.rank = rank;
        nextId ++;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
