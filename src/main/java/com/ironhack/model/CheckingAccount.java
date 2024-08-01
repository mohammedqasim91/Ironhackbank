package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class CheckingAccount extends Account {
    private double overdraftLimit;

    /* Getters and Setters */

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
