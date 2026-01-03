package com.objectmodelling.ecommerceplatform;

import java.util.ArrayList;

public class Customer {

    private int customerId;
    private String name;
    private ArrayList<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order.");
    }

    public void viewOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

