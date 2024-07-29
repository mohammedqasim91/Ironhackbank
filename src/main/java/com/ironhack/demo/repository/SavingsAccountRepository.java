package com.ironhack.demo.repository;

import com.ironhack.demo.model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {
    // Add specific methods if needed
}
