package com.noteverse.note_service.api.model;

public class Author {

    private int id;
    private String name;
    private String creationDate;
    private String updatedDate;

    public Author(int id, String name, String creationDate, String updatedDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}
