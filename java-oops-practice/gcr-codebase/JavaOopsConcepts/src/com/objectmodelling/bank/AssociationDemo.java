package com.objectmodelling.bank;

public class AssociationDemo {

    public static void main(String[] args) {

        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        Customer customer1 = new Customer("Amit");
        Customer customer2 = new Customer("Neha");

        Account acc1 = bank1.openAccount(customer1, 101);
        Account acc2 = bank2.openAccount(customer1, 102);
        Account acc3 = bank1.openAccount(customer2, 201);

        acc1.deposit(5000);
        acc2.deposit(3000);
        acc3.deposit(7000);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}

