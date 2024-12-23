package com.neoteric.java.jpa.monthlyExpenses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class CreditCard {
    @Id
    @Column
    private String cardNo;

    @Column
    private Double limit;

    @OneToMany(mappedBy = "creditCard")
    private List<Transaction> transactionList;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}
