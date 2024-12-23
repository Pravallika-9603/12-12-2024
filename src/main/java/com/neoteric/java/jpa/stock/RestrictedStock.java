package com.neoteric.java.jpa.stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Entity
@Table
public class RestrictedStock extends Stock {
    @Column(name = "vestingPeriod")
    private int vestingPeriod;//time to wait to gain full owner ship

    public int getVestingPeriod() {
        return vestingPeriod;
    }

    public void setVestingPeriod(int vestingPeriod) {
        this.vestingPeriod = vestingPeriod;
    }
}
