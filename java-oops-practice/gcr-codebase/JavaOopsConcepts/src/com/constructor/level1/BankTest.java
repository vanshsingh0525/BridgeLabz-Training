package com.constructor.level1;

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, "John Doe", 5000);

        sa.displayAccountDetails();

        // Modify balance using public method
        sa.setBalance(6000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}

