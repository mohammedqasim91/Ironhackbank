package com.ironhack.demo;

import com.ironhack.demo.model.CheckingAccount;
import com.ironhack.demo.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AccountTests {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void testCreateAccount() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOwner("John Doe");
        checkingAccount.setBalance(1000);
        checkingAccount.setOverdraftLimit(500);

        accountRepository.save(checkingAccount);
        assertThat(checkingAccount.getId()).isNotNull();
    }
}
