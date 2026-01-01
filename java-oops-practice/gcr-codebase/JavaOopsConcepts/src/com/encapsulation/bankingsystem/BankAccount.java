package com.encapsulation.bankingsystem;

public abstract class BankAccount {

    // Encapsulated fields
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (no direct field access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder    : " + holderName);
        System.out.println("Balance   : " + balance);
    }
}

