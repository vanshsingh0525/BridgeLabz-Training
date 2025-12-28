package com.constructor.level1;

public class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared by all vehicles)
    static double registrationFee = 5000.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Vansh", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500.0);
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

