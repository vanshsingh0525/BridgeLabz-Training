package com.objectmodelling.multilevelinheritance;

public class OrderTest {

    public static void main(String[] args) {

        Order order1 = new Order(1001, "2024-01-10");
        Order order2 = new ShippedOrder(1002, "2024-01-11", "TRK12345");
        Order order3 = new DeliverOrder(1003, "2024-01-12", "TRK67890", "2024-01-15");

        order1.displayDetails();
        order2.displayDetails();
        order3.displayDetails();
    }
}

