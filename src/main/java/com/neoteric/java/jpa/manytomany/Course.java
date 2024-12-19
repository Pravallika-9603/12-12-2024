package com.neoteric.java.jpa.manytomany;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",insertable=false, updatable=false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "fee")
    private int fee;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }
}
