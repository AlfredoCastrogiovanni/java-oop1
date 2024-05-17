package org.learning.bank;

import java.math.BigDecimal;
import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String name;
    private BigDecimal balance;
    
    public BankAccount(String name) {
        Random random = new Random();
        this.accountNumber = random.nextInt(1, 1000);

        this.name = name;
        this.balance = BigDecimal.valueOf(0.0);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }

        if (balance.subtract(BigDecimal.valueOf(amount)).compareTo(BigDecimal.valueOf(0.0)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
            return true;
        }

        return false;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        } else {
            balance = balance.add(BigDecimal.valueOf(amount));
        }
    }

}
