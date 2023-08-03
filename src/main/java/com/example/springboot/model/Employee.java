package com.example.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name",nullable=false)
    private String FirstName;

    @Column(name="last_name")
    private String LastName;

    @Column(name="email")
    private String email;
}
