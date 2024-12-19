/*
package com.neoteric.java.jpa;

import com.neoteric.java.jpa.onetomany.EmployeeEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;


public class JpaPractice {

    public List<EmployeeEntity> getEmployeesData() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select p from EmployeeEntity p");
        List<EmployeeEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        return resultList;
    }
    public List<ProjectEntity> getProjectDataAndEmp() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p from ProjectEntity p inner join EmployeeEntity e on p.proId=e.project");

        List<ProjectEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        for (ProjectEntity p:resultList){
            System.out.println(p.getName());
            System.out.println(p.getEmployeeEntityList());
        }

        return resultList;
    }

    public List<ProjectEntity> selfJoinOnEmp() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("SELECT name,m FROM EmployeeEntity e,EmployeeEntity m where e.managerid=m.empid");

        List<ProjectEntity> resultList = query.getResultList();

        entityManager.getTransaction().commit();

        for (ProjectEntity p:resultList){
            System.out.println(p.getName());
            // System.out.println(p.getEmployeeEntityList());
        }

        return resultList;
    }

    public void insertEmployeesData() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

//        EmployeeEntity entity=new EmployeeEntity();
//        entity.setName("pravali");
//        entity.setDept("IT");

        EmployeeEntity entity1=new EmployeeEntity();
        entity1.setEmpid(9);
        entity1.setName("pravali");
        entity1.setDept("IT");

       // entityManager.persist(entity);
        entityManager.persist(entity1);
        entityManager.getTransaction().commit();
    }
}

*/
