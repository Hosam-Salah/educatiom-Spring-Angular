package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Content;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Enumerated(EnumType.ORDINAL)
    private Content content;

    @Column(name = "course_price")
    private String coursePrice;

    private List<Master> masters;
}
