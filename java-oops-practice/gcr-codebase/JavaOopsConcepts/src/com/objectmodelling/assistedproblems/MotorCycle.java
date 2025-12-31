package com.objectmodelling.assistedproblems;

public class MotorCycle extends Vehicle {

    private boolean hasCarrier;

    public MotorCycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier   : " + hasCarrier);
        System.out.println("Vehicle Type  : Motorcycle");
    }
}

