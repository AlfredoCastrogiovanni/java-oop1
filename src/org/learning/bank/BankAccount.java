package org.learning.bank;

import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    
    public BankAccount(String name) {
        Random random = new Random();
        this.accountNumber = random.nextInt(1, 1000);

        this.name = name;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }

        if (balance - amount > 0) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        } else {
            balance += amount;
        }
    }

}
