package com.constructor.level1;

public class BankAccount {

    public int accountNumber;          // Public
    protected String accountHolder;     // Protected
    private double balance;             // Private

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

