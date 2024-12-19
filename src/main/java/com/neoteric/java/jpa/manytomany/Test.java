/*
package com.neoteric.java.jpa.manytomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Test {

        public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateDemo");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            List<Student> studentList=new ArrayList<>();

            Student student1 = new Student();
            student1.setName("churi");

            Student student3 = new Student();
            student1.setName("mani");

            Student student2 = new Student();
            student2.setName("padma");

            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);

            Course course1 = new Course();
            course1.setName("java");
            course1.setFee(5000);


            Course course2 = new Course();
            course2.setName("python");


            student1.setCourses(course1);
            student1.setCourses(course2);

            student2.setCourses(course1);

            student3.setCourses(course2);

            course1.setStudents(student1);
            course1.setStudents(student2);

            course2.setStudents(student1);
            course2.setStudents(student3);
            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(course1);
            em.persist(course2);

            em.getTransaction().commit();

            em.close();
            emf.close();

            System.out.println(SingletonClass.getInstance().studentsRelatedToCourse("java",studentList));
            //SingletonClass.singletonCheck//.studentsRelatedToCourse("java",studentList);
        }
    }



*/
