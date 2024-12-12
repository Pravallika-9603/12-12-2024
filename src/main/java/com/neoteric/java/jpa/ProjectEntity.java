package com.neoteric.java.jpa;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")
public class ProjectEntity {

    public ProjectEntity(){

    }

    @Id
    @Column(name = "proId")
    private int proId;

    @Column(name = "projectName")
    private String name;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<EmployeeEntity> employeeEntityList;


    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}
