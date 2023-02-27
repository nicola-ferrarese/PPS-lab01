import lab01.example.model.AccountHolder;

import lab01.example.model.BackAccountAtm;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBackAccountWithAtmTest {

    private AccountHolder accountHolder;

    private BackAccountAtm bankAccount;
    private final int initialDeposit = 100;
    
    @BeforeEach
    void beforeEach() {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }
    @Test
    void testDepositAtm() {
        bankAccount.deposit(accountHolder.getId(), initialDeposit);
        assertEquals(initialDeposit - bankAccount.getFee(), bankAccount.getBalance());
    }

    @Test
    void testWithdrawnAtm(){
        bankAccount.deposit(accountHolder.getId(), initialDeposit);
        bankAccount.withdraw(accountHolder.getId(), initialDeposit - ( 2 * bankAccount.getFee()));
        assertEquals(0, bankAccount.getBalance());
    }
}