package com.constructor.level1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);      // Accessible
        System.out.println("Account Holder: " + accountHolder);      // Accessible
        System.out.println("Balance: " + getBalance());              // Access via method
    }
}

