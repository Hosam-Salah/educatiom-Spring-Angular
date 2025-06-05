package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Gender;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.xml.crypto.Data;

@Entity
@Table(name = "master")
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Column(name = "age")
    private String age;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Temporal(TemporalType.DATE)
    private Data data;

    @CreationTimestamp
    @Column(name = "data_created")
    private Data dateCreated;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private Data lastUpdated;

    private Course course;
}
