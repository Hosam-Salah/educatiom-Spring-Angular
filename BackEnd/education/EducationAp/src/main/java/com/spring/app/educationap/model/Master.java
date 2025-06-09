package com.spring.app.educationap.model;

import com.spring.app.educationap.model.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master")
public class Master extends  BaseEntity{


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
    private Date data;

    @CreationTimestamp
    @Column(name = "data_created")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
