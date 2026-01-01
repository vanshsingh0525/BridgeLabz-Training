package com.objectmodelling.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {

    private int tenure; // in years

    public FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
        System.out.println("Tenure         : " + tenure + " years");
    }
}

