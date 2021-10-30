package com.ultimate.lisbon.models.repositories;

import com.ultimate.lisbon.models.TagType;
import com.ultimate.lisbon.models.User;

import java.util.ArrayList;

public class TagTypeRepository {
    private static ArrayList<TagType> tagTypes = new ArrayList<>();

    public static void opulate(){
        tagTypes.add(new TagType("System"));
        tagTypes.add(new TagType("User"));
        tagTypes.add(new TagType("Sponsor"));
    }

    public static ArrayList<TagType> getAllTagTypes(){
        return tagTypes;
    }

    public static TagType getTagTypesById(int id){
        for (TagType tagType : tagTypes) {
            if (tagType.getId() == id) {
                return tagType;
            }
        }
        return null;
    }

    public static TagType getIdByTagType(String name){
        for (TagType tagType : tagTypes) {
            if (tagType.getName().equals(name)) {
                return tagType;
            }
        }
        return null;
    }

    public static boolean deleteTagType(int id) {
        return tagTypes.removeIf((s) -> s.getId() == id);
    }

    public static TagType addTagType(TagType tagType) {
        tagTypes.add(tagType);
        return tagType;
    }
}
