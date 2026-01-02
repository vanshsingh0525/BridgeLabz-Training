package com.objectmodelling.bank;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, int accountNumber) {
        Account account = new Account(accountNumber, this);
        accounts.add(account);
        customer.addAccount(account);

        System.out.println("Account opened in " + bankName +
                " for " + customer.getName());
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}

