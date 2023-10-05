package com.noteverse.note_service.api.controller;

import com.noteverse.note_service.api.model.Note;
import com.noteverse.note_service.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

 @GetMapping("/note")
    public Note getnote(@RequestParam Integer id){
        Optional<Note> note = noteService.getnote(id);
        return (Note) note.orElse(null);
    }

@GetMapping("/")
public List<Note> getAllnotes() {
    return noteService.getAllnotes();
}
}