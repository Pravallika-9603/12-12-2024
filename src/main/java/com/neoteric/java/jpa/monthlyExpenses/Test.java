package com.neoteric.java.jpa.monthlyExpenses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Calendar;
import java.util.Date;

public class Test {

        public static void main(String[] args) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateDemo");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CreditCard creditCard=new CreditCard();
            creditCard.setCardNo("74651");
            creditCard.setLimit(50000.0);

            Transaction transaction=new Transaction();
            transaction.setCreditCard(creditCard);
            transaction.setTransType("debit");
            transaction.setTransAmount(100.0);
            transaction.setTransDate(new Date());

            Transaction transaction1=new Transaction();
            transaction1.setCreditCard(creditCard);
            transaction1.setTransType("debit");
            transaction1.setTransAmount(100.0);
            Date currentDate = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentDate);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            transaction.setTransDate(calendar.getTime());


            Transaction transaction2=new Transaction();
            transaction2.setCreditCard(creditCard);
            transaction2.setTransType("debit");
            transaction2.setTransAmount(100.0);

            Date currentDate1 = new Date();
            Calendar calendar1 = Calendar.getInstance();
            calendar.setTime(currentDate1);
            calendar.add(Calendar.DAY_OF_MONTH, 2);
            transaction.setTransDate(calendar1.getTime());

            Transaction transaction3=new Transaction();
            transaction3.setCreditCard(creditCard);
            transaction3.setTransType("debit");
            transaction3.setTransAmount(100.0);
            Date currentDate2 = new Date();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(currentDate2);
            calendar.add(Calendar.DAY_OF_MONTH, 3);
            transaction.setTransDate(calendar2.getTime());

            Transaction transaction4=new Transaction();
            transaction4.setCreditCard(creditCard);
            transaction4.setTransType("debit");
            transaction4.setTransAmount(1000.0);
            Date currentDate3 = new Date();
            Calendar calendar3 = Calendar.getInstance();
            calendar.setTime(currentDate3);
            calendar.add(Calendar.DAY_OF_MONTH, 4);
            transaction.setTransDate(calendar3.getTime());
        }
    }


