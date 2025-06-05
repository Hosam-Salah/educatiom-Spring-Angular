package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Gender;

import javax.xml.crypto.Data;

public class Master {

    private long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private String age;

    private String phone;

    private String address;

    private Data data;

    private Data dateCreated;

    private Data lastUpdated;

    private Course course;
}
