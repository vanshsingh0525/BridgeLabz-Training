package com.inheritance.hybridinheritance;

public class RestaurantDemo {

    public static void main(String[] args) {

        Worker chef = new Chef(101, "Arjun", "Italian");
        Worker waiter = new Waiter(102, "Rohit", 6);

        ((Person) chef).displayPersonDetails();
        chef.performDuties();
        System.out.println();

        ((Person) waiter).displayPersonDetails();
        waiter.performDuties();
    }
}

