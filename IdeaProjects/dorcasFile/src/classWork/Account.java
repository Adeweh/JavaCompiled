package classWork;

import java.util.Scanner;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            if (amount > 0) {
                balance = balance - amount;
            }

        }
    }
}

