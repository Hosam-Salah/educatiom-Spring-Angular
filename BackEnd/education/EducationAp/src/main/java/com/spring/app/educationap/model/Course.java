package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Content;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "course")
public class Course extends BaseEntity{


    @Enumerated(EnumType.ORDINAL)
    private Content content;

    @Column(name = "course_price" )
    private String coursePrice;

    @OneToMany(mappedBy = "course")
    private List<Master> masters;
}
