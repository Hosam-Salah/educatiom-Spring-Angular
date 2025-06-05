package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Content;

import java.util.List;

public class Course {
    private long id;

    private String courseName;

    private String coursePrice;

    private Content content;

    private List<Master> masters;
}
