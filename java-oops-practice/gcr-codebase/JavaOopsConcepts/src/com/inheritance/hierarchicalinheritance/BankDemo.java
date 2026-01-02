package com.inheritance.hierarchicalinheritance;

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount sa =
            new SavingsAccount(101, 50000, 4.5);

        CheckingAccount ca =
            new CheckingAccount(102, 30000, 10);

        FixedDepositAccount fd =
            new FixedDepositAccount(103, 200000, 5);

        sa.displayAccountDetails();
        sa.displayAccountType();
        System.out.println();

        ca.displayAccountDetails();
        ca.displayAccountType();
        System.out.println();

        fd.displayAccountDetails();
        fd.displayAccountType();
    }
}

