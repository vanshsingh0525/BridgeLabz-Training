package mybank;

public class MyBankDemo {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB1001", 10000);
        Account current = new CurrentAccount("CA2001", 20000);

        savings.deposit(2000);
        savings.withdraw(3000);

        current.withdraw(5000);

        System.out.println("\nSavings Account Balance: " + savings.checkBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println("\nCurrent Account Balance: " + current.checkBalance());
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}

