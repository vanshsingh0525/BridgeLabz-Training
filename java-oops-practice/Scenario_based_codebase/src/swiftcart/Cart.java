package swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // Constructor without items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice() - p.getDiscount();
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        totalPrice = totalPrice - couponAmount; // operator usage
    }

    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(
                p.name + " | Qty: " + p.quantity +
                " | Price: " + p.getTotalPrice() +
                " | Discount: " + p.getDiscount()
            );
        }
        System.out.println("Total Payable: " + totalPrice);
    }
}

