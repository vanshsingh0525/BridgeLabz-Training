package com.encapsulation.ridehailing;

public class Auto extends Vehicle implements GPS {

    private String currentLocation;

    public Auto(int id, String driverName, double ratePerKm) {
        super(id, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // base charge
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

