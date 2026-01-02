package com.inheritance.multilevelinheritance;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking No: " + trackingNumber);
    }
}

