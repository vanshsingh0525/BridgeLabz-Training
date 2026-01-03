package ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.05;

    public BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deductBalance(totalDeduction)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Business Transfer", amount));
            System.out.println("Business transfer successful (Tax applied)");
        } else {
            System.out.println("Insufficient balance in business wallet");
        }
    }
}

