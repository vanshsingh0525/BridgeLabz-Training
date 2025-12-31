package com.objectmodelling.assistedproblems;

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 12.5);
        Vehicle v3 = new MotorCycle(140, "Petrol", true);

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();   // Polymorphic method call
        }
    }
}

