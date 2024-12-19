package com.neoteric.java.jpa.manytomany;

import java.util.ArrayList;
import java.util.List;

public class SingletonCheck {

    public int studentsRelatedToCourse(String course,List<Student> studentList){
        int studentCourese=0;
        Object studentCoures[]=new Object[50];
        List<Student> students=new ArrayList<>();
        for(Student s:studentList){
             studentCoures=s.getCourses().stream().toArray();

        }

        return studentCourese;

    }
}
