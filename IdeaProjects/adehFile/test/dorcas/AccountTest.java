package dorcas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void accountTest(){ //method, Test above confirms its not an ordinary method and calls it with some special method
        Account adehAccount = new Account();

        int amount = adehAccount.getBalance();  // initializing a variable and assigning a value

        assertEquals(0, amount);

    }
    @Test
    public void withdrawTest() {
        Account deeAccount = new Account(); //to withdraw given that account exist

        deeAccount.withdraw(2000); //when the user wants to withdraw

        int balance = deeAccount.getBalance();

        assertEquals(0, balance); //assert that balance reduces

    }
    @Test
    public void negativeWithdraw(){
        Account deeAccount = new Account();

        deeAccount.withdraw(-2000);

        int balance = deeAccount.getBalance();

        assertEquals(0, balance);









    }
}
;