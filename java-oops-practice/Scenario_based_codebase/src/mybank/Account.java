package mybank;

public abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;   // encapsulated

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Protected helpers to control balance access
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

    @Override
    public void deposit(double amount) {
        addBalance(amount);
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (deductBalance(amount)) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Polymorphic behavior
    public abstract double calculateInterest();
}

