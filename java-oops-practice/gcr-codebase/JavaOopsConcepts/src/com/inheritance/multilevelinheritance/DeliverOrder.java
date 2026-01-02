package com.inheritance.multilevelinheritance;

public class DeliverOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliverOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date : " + deliveryDate);
    }
}

