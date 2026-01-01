package com.objectmodelling.hybridinheritance;

public class VehicleDemo {

    public static void main(String[] args) {

        ElectricVehicle ev =
            new ElectricVehicle("Tesla Model 3", 225);

        PetrolVehicle pv =
            new PetrolVehicle("Honda City", 190);

        ev.displayVehicleDetails();
        ev.charge();
        System.out.println();

        pv.displayVehicleDetails();
        pv.refuel();
    }
}

