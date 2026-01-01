package com.encapsulation.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ECommerceDemo {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        calculateFinalPrices(products);
    }

    // Polymorphic method
    public static void calculateFinalPrices(List<Product> products) {

        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product : " + p.getName());
            System.out.println("Final Price : " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}

