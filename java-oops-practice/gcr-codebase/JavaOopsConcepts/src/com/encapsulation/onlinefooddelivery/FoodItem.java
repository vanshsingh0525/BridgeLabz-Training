package com.encapsulation.onlinefooddelivery;

public abstract class FoodItem {

    // Encapsulated fields
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (restricted access)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item     : " + itemName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

