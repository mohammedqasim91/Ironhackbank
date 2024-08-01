package com.ironhack.repository;

import com.ironhack.model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {
    // Add specific methods if needed
}