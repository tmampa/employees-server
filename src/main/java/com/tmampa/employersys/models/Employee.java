package com.tmampa.employersys.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "salary")
    private int salary;

    @Column(name = "email")
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "department")
    private String department;

    @Column(name = "position")
    private String position;

    @Column(name = "is_active")
    private boolean isActive;

}
