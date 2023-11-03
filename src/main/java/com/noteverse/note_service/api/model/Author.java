package com.noteverse.note_service.api.model;

public class Author {

    private int id_author;
    private String name_author;
    private String creationDate_author;
    private String updatedDate_author;

    public Author(int id_author, String name_author, String creationDate, String updatedDate) {
        this.id_author = id_author;
        this.name_author = name_author;
        this.creationDate_author = creationDate;
        this.updatedDate_author = updatedDate;
    }

    public int getId() {
        return id_author;
    }

    public void setId(int id_author) {
        this.id_author = id_author;
    }

    public String getName() {
        return name_author;
    }

    public void setName(String name_author) {
        this.name_author = name_author;
    }

    public String getCreationDate() {
        return creationDate_author;
    }

    public void setCreationDate(String creationDate_author) {
        this.creationDate_author = creationDate_author;
    }

    public String getUpdatedDate() {
        return updatedDate_author;
    }

    public void setUpdatedDate(String updatedDate_author) {
        this.updatedDate_author = updatedDate_author;
    }
}
