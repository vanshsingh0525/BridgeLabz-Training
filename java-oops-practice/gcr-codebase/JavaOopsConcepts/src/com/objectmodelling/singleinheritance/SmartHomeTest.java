package com.objectmodelling.singleinheritance;

public class SmartHomeTest {

    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", "ON", 24);

        thermostat.displayStatus();
    }
}

