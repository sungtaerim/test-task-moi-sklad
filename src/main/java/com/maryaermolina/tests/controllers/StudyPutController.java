package com.maryaermolina.tests.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/update")
public class StudyPutController {

    // put requests
    @PutMapping("/student/{studentId}")
    public String updateStudent(@PathVariable int studentId) {
        return "";
    }

    @PutMapping("/subject/{subjectId}")
    public String updateSubject(@PathVariable int subjectId) {
        return "";
    }

    // TODO: придумать другое
    @PutMapping("{studentId}/{subjectId}")
    public String updateMark() {
        return "";
    }
}
