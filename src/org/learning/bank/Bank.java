package org.learning.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        BankAccount BankAccount = new BankAccount(name);

        

        scanner.close();
    }
}
