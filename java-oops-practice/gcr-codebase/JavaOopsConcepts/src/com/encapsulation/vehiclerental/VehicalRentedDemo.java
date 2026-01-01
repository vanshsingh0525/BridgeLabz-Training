package com.encapsulation.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalDemo {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-02"));
        vehicles.add(new Truck("TRK303", 3000, "TRK-INS-03"));

        int days = 3;

        for (Vehicle v : vehicles) {

            v.displayVehicleDetails();

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost (" + days + " days): " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }

            System.out.println("-------------------------------");
        }
    }
}

