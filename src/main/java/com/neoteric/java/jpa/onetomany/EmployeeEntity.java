package com.neoteric.java.jpa.onetomany;

import jakarta.persistence.*;

//@Entity
@Table(name = "emp")
public class EmployeeEntity {

    public EmployeeEntity() {

    }

    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "managerid")
    private int managerid;

    @Column(name = "projectId", insertable = false, updatable = false)
    private int project;

    @Column(name = "salary")
    private int salary;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private String dept;

    @Column(name = "state")
    private String state;

    @JoinColumn(name = "projectId", referencedColumnName = "proId")
    @ManyToOne()
    //private ProjectEntity projectEntity;


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getProjectId() {
        return project;
    }

    public void setProjectId(int projectId) {
        this.project = projectId;
    }

}
