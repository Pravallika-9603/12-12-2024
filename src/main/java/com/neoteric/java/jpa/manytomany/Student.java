package com.neoteric.java.jpa.manytomany;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @Column(name = "address")
//    private String address;

    @ManyToMany
    private Set<Course> courses = new HashSet<>();

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses.add(courses);
    }


//    public Set<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Set<Course> courses) {
//        this.courses = courses;
//    }
}
