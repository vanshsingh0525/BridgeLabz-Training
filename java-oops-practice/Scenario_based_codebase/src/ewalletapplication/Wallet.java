package ewalletapplication;

import java.util.ArrayList;

public abstract class Wallet implements Transferrable {

    private double balance;   // private for encapsulation
    protected ArrayList<Transaction> transactions;

    // Normal wallet
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        transactions = new ArrayList<>();
    }

    // Wallet with referral bonus (constructor overloading)
    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
        transactions = new ArrayList<>();
    }

    protected double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Load Money", amount));
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.displayTransaction();
        }
    }
}

