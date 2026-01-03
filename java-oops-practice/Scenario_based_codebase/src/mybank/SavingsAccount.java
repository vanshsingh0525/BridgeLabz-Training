package mybank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accNo) {
        super(accNo);
    }

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;   // operators
    }
}

