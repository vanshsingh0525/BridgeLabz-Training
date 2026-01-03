package ewalletapplication;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 10000;

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded!");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Transfer Sent", amount));
            System.out.println("Personal wallet transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

