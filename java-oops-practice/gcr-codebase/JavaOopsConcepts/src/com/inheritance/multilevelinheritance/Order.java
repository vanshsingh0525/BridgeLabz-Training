package com.inheritance.multilevelinheritance;

public class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayDetails() {
        System.out.println("Order ID   : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Status     : " + getOrderStatus());
    }
}

