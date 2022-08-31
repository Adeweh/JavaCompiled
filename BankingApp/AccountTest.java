package BankingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    @BeforeEach
    void setUp() {
        account = new Account("Dorcas", 1001, 1);
    }


//    accountCanBeCreatedTest;
//    accountCanDepositTest;
//    accontCanWithdrawTest;
//    withdrawWithWrongPinFails;

    @Test
    void testDeposit(){
       account.deposit(5000);
       account.deposit(5000);
       double balance = account.getBalance();
       assertEquals(10000, balance);
    }

    @Test
    void testWithdraw(){
        double balance =account.withdraw(20000);

        assertEquals(10000, balance );
    }
}