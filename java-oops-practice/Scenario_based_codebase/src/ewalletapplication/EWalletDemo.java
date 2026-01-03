package ewalletapplication;

public class EWalletDemo {

    public static void main(String[] args) {

        User u1 = new User(1, "Amit",
                new PersonalWallet(5000, 500));

        User u2 = new User(2, "Riya",
                new BusinessWallet(20000));

        u1.viewBalance();
        u2.viewBalance();

        u1.getWallet().transferTo(u2, 3000);
        u2.getWallet().transferTo(u1, 5000);

        System.out.println("\nTransaction History (Amit):");
        u1.getWallet().showTransactions();

        System.out.println("\nTransaction History (Riya):");
        u2.getWallet().showTransactions();

        u1.viewBalance();
        u2.viewBalance();
    }
}

