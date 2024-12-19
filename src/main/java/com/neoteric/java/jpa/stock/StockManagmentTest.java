package com.neoteric.java.jpa.stock;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class StockManagmentTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager em= entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        StockOption stockOption = new StockOption();
        stockOption.setTickerSymbol("AAPL");
        stockOption.setStrikePrice(150.0);
        stockOption.setComName("Neoteric pvt.");
        stockOption.setOptionType("put");



        FutureStock futureStock = new FutureStock();
        futureStock.setTickerSymbol("TSLA");
        futureStock.setExpirationDate(new Date());
        futureStock.setComName("fgduywb");


        RestrictedStock restrictedStock = new RestrictedStock();
        restrictedStock.setTickerSymbol("GDRTX");
        restrictedStock.setVestingPeriod(20);
        restrictedStock.setComName("jhsvbsdg");

        em.persist(stockOption);
        em.persist(futureStock);
        em.persist(restrictedStock);

        em.getTransaction().commit();

        em.close();


    }
}
