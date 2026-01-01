package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // eligible up to 3 times balance
    }
}

