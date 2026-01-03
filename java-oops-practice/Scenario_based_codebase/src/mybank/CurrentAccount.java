package mybank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.5;

    public CurrentAccount(String accNo) {
        super(accNo);
    }

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;   // operators
    }
}

