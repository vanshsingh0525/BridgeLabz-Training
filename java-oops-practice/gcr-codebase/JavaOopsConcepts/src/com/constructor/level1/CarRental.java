package com.constructor.level1;

class CarRental {

    // Attributes
    String customerName;
    String carModel;
    int rentalDays;

    // Cost per day (fixed)
    static final double COST_PER_DAY = 1500.0;

    // Default Constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    // Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Vansh Singh", "Hyundai Creta", 5);
        rental2.displayRentalDetails();
    }
}

