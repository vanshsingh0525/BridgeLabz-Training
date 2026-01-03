package com.objectmodelling.ecommerceplatform;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println();
    }
}

