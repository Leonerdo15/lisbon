package com.ultimate.lisbon.models;

import java.util.HashMap;

public class TagType {
    private static  int nextId = 1;
    private int id;
    private String name;
    private HashMap<Integer, String> idName = new HashMap<>();

    public TagType(){
    }

    public TagType(String name){
        this.name = name;
        this.id = nextId;
        idName.put(id, name);
        nextId ++;
    }

    public String getNameById(int id){
        return idName.get(id);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
