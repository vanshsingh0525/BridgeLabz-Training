package com.encapsulation.onlinefooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryDemo {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order);
    }

    // Polymorphic order-processing method
    public static void processOrder(List<FoodItem> order) {

        double finalBill = 0;

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double payable = total - discount;
            finalBill += payable;

            System.out.println("Total Price : " + total);
            System.out.println("Discount    : " + discount);
            System.out.println("Payable     : " + payable);
            System.out.println("----------------------------");
        }

        System.out.println("Final Bill Amount : " + finalBill);
    }
}

