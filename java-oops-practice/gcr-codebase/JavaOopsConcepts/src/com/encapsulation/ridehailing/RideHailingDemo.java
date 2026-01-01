package com.encapsulation.ridehailing;

import java.util.ArrayList;
import java.util.List;

public class RideHailingDemo {

    public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        rides.add(new Car(101, "Rahul", 15));
        rides.add(new Bike(102, "Amit", 10));
        rides.add(new Auto(103, "Suresh", 12));

        double distance = 10; // km

        calculateRides(rides, distance);
    }

    // Polymorphic method
    public static void calculateRides(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();
            System.out.println("Distance : " + distance + " km");
            System.out.println("Fare     : " + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("MG Road");
                System.out.println("Location : " + gps.getCurrentLocation());
            }

            System.out.println("----------------------------");
        }
    }
}

