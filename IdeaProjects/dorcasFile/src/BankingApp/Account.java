package BankingApp;

import java.util.InputMismatchException;

public class Account {
    private String name;

    private int accountNumber;

    private int BVN;

    private double balance;

    public Account(String name, int accountNumber, int BVN) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.BVN = BVN;

    }

    private String accountType;

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBVN() {
        return BVN;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InputMismatchException(amount + " cannot be deposited!");
        }
    }

    public double withdraw(double amount) {
        balance = 10000;
        double withdraw = 0;
        if (amount > 0) {
            withdraw = (balance - amount);
        }
        return withdraw;
    }
}
