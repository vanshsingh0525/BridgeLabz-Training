package medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected LocalDate expiryDate;

    private double price;     // Sensitive pricing
    private int quantity;     // Internal stock

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price,
                    LocalDate expiryDate, int quantity) {

        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Private pricing logic
    private double calculateCost(int qty) {
        double total = price * qty;
        double discount = qty >= 10 ? total * 0.05 : 0;
        return total - discount;
    }

    // Controlled stock update
    protected boolean reduceStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    @Override
    public double sell(int qty) {
        if (checkExpiry()) {
            System.out.println(name + " is expired. Cannot sell.");
            return 0;
        }

        if (!reduceStock(qty)) {
            System.out.println("Insufficient stock for " + name);
            return 0;
        }

        return calculateCost(qty);
    }

    public int getQuantity() {
        return quantity;
    }
}

