package com.objectmodelling.bank;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println(
                "Bank: " + account.getBank().getBankName() +
                ", Balance: " + account.getBalance()
            );
        }
        System.out.println();
    }
}

