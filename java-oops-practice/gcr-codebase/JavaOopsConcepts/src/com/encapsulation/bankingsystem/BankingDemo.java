package com.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingDemo {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Anita", 50000));
        accounts.add(new CurrentAccount("CA202", "Rohit", 80000));

        for (BankAccount acc : accounts) {

            acc.displayAccountDetails();

            double interest = acc.calculateInterest();
            System.out.println("Interest Earned : " + interest);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(50000);
                System.out.println("Loan Eligibility : " + loan.calculateLoanEligibility());
            }

            System.out.println("-----------------------------");
        }
    }
}

