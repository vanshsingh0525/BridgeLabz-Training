package com.encapsulation.ridehailing;

public class Bike extends Vehicle implements GPS {

    private String currentLocation;

    public Bike(int id, String driverName, double ratePerKm) {
        super(id, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) * 0.8; // cheaper ride
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

