package com.objectmodelling.ecommerceplatform;

public class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println(
            "Product ID: " + productId +
            ", Name: " + productName +
            ", Price: " + price
        );
    }
}

