package com.constructor.level1;

class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Parameterized constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // increment when a product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }

    // Class method (static method)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        p1.displayProductDetails();

        Product p2 = new Product("Smartphone", 25000);
        p2.displayProductDetails();

        // Calling class method using class name
        Product.displayTotalProducts();
    }
}
