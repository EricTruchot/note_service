package com.noteverse.note_service.api.model;

public class Note {

    private int id_note;
    private String title_author;
    private String description_author;

    public Note(int id_note, String title_author, String description_author) {
        this.id_note = id_note;
        this.title_author = title_author;
        this.description_author = description_author;
    }

    public int getId() {
        return id_note;
    }

    public void setId(int id_note) {
        this.id_note = id_note;
    }

    public String gettitle() {
        return title_author;
    }

    public void settitle(String title_author) {
        this.title_author = title_author;
    }

    public String getdescription() {
        return description_author;
    }

    public void setdescription(String description_author) {
        this.description_author = description_author;
    }
}