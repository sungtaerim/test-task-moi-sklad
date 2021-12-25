package com.maryaermolina.tests.models;

import lombok.Data;

@Data
public class Mark {

//    enum Marks {
//        2, 3, 4, 5;
//    }

    private int id;
    private int studentId;
    private int subjectId;
    private int mark;
}
