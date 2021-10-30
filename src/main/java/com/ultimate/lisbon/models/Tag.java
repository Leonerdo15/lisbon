package com.ultimate.lisbon.models;

public class Tag {
    private static int nexId = 1;
    private int id;
    private String name;
    private TagType tagType = new TagType();
    private String tagTypeName;
    private int tagTypeId;

    public Tag(String name, int tagTypeId){
        this.id = nexId;
        this.name = name;
        this.tagTypeName = tagType.getNameById(tagTypeId);
        nexId ++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TagType getTagType() {
        return tagType;
    }

    public String getTagTypeName() {
        return tagTypeName;
    }

    public int getTagTypeId() {
        return tagTypeId;
    }

    // The user can change if your tag is
    // public(System -> Tags must reach a certain number of uses to being part of the system)
    // or private(User)
    public void setTagTypeId(int tagTypeId) {
        this.tagTypeId = tagTypeId;
    }
}
