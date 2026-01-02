package com.inheritance.hierarchicalinheritance;

public class BankAccount {

    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

