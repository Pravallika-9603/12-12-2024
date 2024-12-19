//package com.neoteric.java.jpa.onetoone;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//public class OnetoOne {
//
//        public static void main(String[] args) {
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
//            EntityManager em= entityManagerFactory.createEntityManager();
//            em.getTransaction().begin();
//
//            Person person = new Person();
//            person.setName("churi");
//            em.persist(person);
//
//            Address address = new Address();
//            address.setPersonEntity1(person);
//            address.setCity("Hyderabad");
//            em.persist(address);
//            person.setAddressenity(address);
//
//            em.getTransaction().commit();
//
//            Person retrivedperson=em.find(Person.class,person.getPid());
//            System.out.println(retrivedperson.getName());
//            System.out.println(retrivedperson.getAddressenity().getCity());
//
//            em.close();
//            entityManagerFactory.close();
//        }
//    }
//
