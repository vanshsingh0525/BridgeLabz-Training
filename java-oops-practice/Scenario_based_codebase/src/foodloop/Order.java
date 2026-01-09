package foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {

    private ArrayList<FoodItem> items;
    private double total;

    // Constructor: empty order
    public Order() {
        items = new ArrayList<>();
    }

    // Constructor: combo meal
    public Order(ArrayList<FoodItem> comboItems) {
        this.items = comboItems;
        calculateTotal();
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    protected void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice(); // Operator usage (sum)
        }
        total -= applyDiscount(); // Discount operator
    }

    // Polymorphism: discount logic varies
    protected double applyDiscount() {
        if (total > 1000) {
            return total * 0.20;
        } else if (total > 500) {
            return total * 0.10;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully");
        System.out.println("Total amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled");
    }
}

