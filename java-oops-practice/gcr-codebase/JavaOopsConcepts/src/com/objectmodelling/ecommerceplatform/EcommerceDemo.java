package com.objectmodelling.ecommerceplatform;

public class EcommerceDemo {

    public static void main(String[] args) {

        // Products
        Product p1 = new Product(101, "Laptop", 60000);
        Product p2 = new Product(102, "Mouse", 500);
        Product p3 = new Product(103, "Keyboard", 1500);

        // Customer
        Customer customer = new Customer(1, "Amit");

        // Order 1
        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Order 2
        Order order2 = new Order(1002);
        order2.addProduct(p3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View orders
        customer.viewOrders();
    }
}

