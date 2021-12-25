package com.maryaermolina.tests.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class StudyPostController {

    // post requests
    @PostMapping("/student")
    public String addStudent() {
        return "";
    }

    @PostMapping("/subject")
    public String addSubject() {
        return "";
    }

    @PostMapping("/{studentId}/{subjectId}")
    public String addNewMark(@PathVariable int studentId, @PathVariable int subjectId) {
        return "";
    }
}
