package com.ultimate.lisbon.models.repositories;

import com.ultimate.lisbon.models.Tag;
import com.ultimate.lisbon.models.TagType;
import com.ultimate.lisbon.models.User;

import java.util.ArrayList;

public class TagRepository {
    private static ArrayList<Tag> tags = new ArrayList<>();

    public static void populate(){
        Tag t;
        tags.add(new Tag("Nature", 1));
        tags.add(new Tag("Medieval", 1));
        tags.add(new Tag("Water", 1));
        tags.add(new Tag("Museum", 1));
        tags.add(new Tag("Park", 1));
        tags.add(new Tag("Animals", 1));
        tags.add(new Tag("Summer", 1));
        tags.add(new Tag("Winter", 1));
        tags.add(new Tag("Night", 2));
        tags.add(new Tag("Camera de Lisboa", 3));
        tags.add(new Tag("Art galleria", 1));
        tags.add(new Tag("Historical", 1));
        tags.add(new Tag("Forests", 1));
        tags.add(new Tag("Zoo", 1));
    }

    public ArrayList<Tag> getAllTags(){
        return tags;
    }

    public ArrayList<Tag> getAllTagsByTagTypeId(int tagTypeId){
        ArrayList<Tag> store = new ArrayList<>();
        for (Tag tag : tags) {
            if (tag.getTagTypeId() == tagTypeId) {
                store.add(tag);
            }
        }
        return store;
    }

    public Tag getTagTypeById(int id){
        for (Tag tag : tags) {
            if (tag.getId() == id) {
                return tag;
            }
        }
        return null;
    }

    public static boolean deleteTagType(int id) {
        return tags.removeIf((s) -> s.getId() == id);
    }

    public static Tag addTag(Tag tag) {
        tags.add(tag);
        return tag;
    }
}
