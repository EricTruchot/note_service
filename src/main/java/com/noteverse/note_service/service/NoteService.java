package com.noteverse.note_service.service;

import com.noteverse.note_service.api.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private List<Note> noteList;

    public NoteService() {
        noteList = new ArrayList<>();

        Note note1 = new Note(1,"Note1", "description1");
        Note note2 = new Note(2,"Note2", "description2");
        Note note3 = new Note(3,"Note3", "description3");
        Note note4 = new Note(4,"Note4", "description4");
        Note note5 = new Note(5,"Note5", "description5");

        noteList.addAll(Arrays.asList(note1,note2,note3,note4,note5));
    }

    public Optional<Note> getnote(Integer id) {
        Optional<Note> optional = Optional.empty();
        for (Note note: noteList) {
            if(id == note.getId()){
                optional = Optional.of(note);
                return optional;
            }
        }
        return optional;
    }

    public List<Note> getAllnotes() {
        return noteList;
    }
}