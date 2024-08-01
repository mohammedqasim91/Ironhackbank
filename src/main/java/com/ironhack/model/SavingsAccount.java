package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class SavingsAccount extends Account {
    private double interestRate;

    // Getters and Setters

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

