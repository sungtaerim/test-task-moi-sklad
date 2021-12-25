package com.maryaermolina.tests.controllers;

import com.maryaermolina.tests.models.Mark;
import com.maryaermolina.tests.models.Student;
import com.maryaermolina.tests.models.Subject;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudyGetController {

    // get requests
    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return new Student();
    }

    @GetMapping("/subject/{subjectId}")
    public Subject getSubject(@PathVariable int subjectId) {
        return new Subject();
    }

    @GetMapping("/mark/{studentId}")
    public Mark getMark(@PathVariable int studentId) {
        return new Mark();
    }
}
