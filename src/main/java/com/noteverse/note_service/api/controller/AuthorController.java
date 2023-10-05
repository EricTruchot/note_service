package com.noteverse.note_service.api.controller;

import com.noteverse.note_service.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

//  @GetMapping("/author")
//     public Author getAuthor(@RequestParam Integer id){
//         Optional<Author> author = authorService.getAuthor(id);
//         return (Author) author.orElse(null);
//     }

@GetMapping("/author")
public List<Map<String, Object>> getAllAuthors() {
    return authorService.getAllAuthors();
}
}