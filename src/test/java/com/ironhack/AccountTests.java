package com.ironhack;

import com.ironhack.model.CheckingAccount;
import com.ironhack.repository.CheckingAccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AccountTests {

    @Autowired
    private CheckingAccountRepository checkingAccountRepository;

    @Test
    void testCreateAccount() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOwner("John Doe");
        checkingAccount.setBalance(1000);
        checkingAccount.setOverdraftLimit(500);

        CheckingAccount savedAccount = checkingAccountRepository.save(checkingAccount);
        assertThat(savedAccount.getId()).isNotNull();
    }

    @Test
    void testUpdateAccount() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOwner("John Doe");
        checkingAccount.setBalance(1000);
        checkingAccount.setOverdraftLimit(500);

        CheckingAccount savedAccount = checkingAccountRepository.save(checkingAccount);
        savedAccount.setBalance(2000);
        CheckingAccount updatedAccount = checkingAccountRepository.save(savedAccount);

        assertThat(updatedAccount.getBalance()).isEqualTo(2000);
    }

    @Test
    void testDeleteAccount() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOwner("John Doe");
        checkingAccount.setBalance(1000);
        checkingAccount.setOverdraftLimit(500);

        CheckingAccount savedAccount = checkingAccountRepository.save(checkingAccount);
        checkingAccountRepository.delete(savedAccount);

        assertThat(checkingAccountRepository.findById(savedAccount.getId())).isEmpty();
    }
}

