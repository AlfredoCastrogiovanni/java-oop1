package org.learning.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        BankAccount BankAccount = new BankAccount(name);

        while (true) {
            System.out.println(" ********* BANK MENU *********");
            System.out.println();
            System.out.println("1) Balance");
            System.out.println("2) Withdraw");
            System.out.println("3) Deposit");
            System.out.println("0) exit");
            System.out.println();

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                double amount;

                switch (choice) {
                    case 1:
                        System.out.println("Your balance: " + BankAccount.getBalance());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        amount = Double.parseDouble(scanner.nextLine());
                        System.out.println();

                        try {
                            if (BankAccount.withdraw(amount)) {
                                System.out.println("You have successfully withdrawn! \n");
                            } else {
                                System.out.println("The withdraw has been rejected! \n");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: ");
                        amount = Double.parseDouble(scanner.nextLine());
                        System.out.println();

                        try {
                            BankAccount.deposit(amount);
                            System.out.println("You have successfully deposited! \n");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;
                    default:
                        break;
                }

                if (choice == 0) {
                    System.out.println("Program closed.");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid input!");
            }
        }

        scanner.close();
    }
}
