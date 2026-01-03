package ridehailingapp;

public class SUV extends Vehicle {

    public SUV(String number) {
        super(number, 6, "SUV");
    }

    @Override
    public double getRatePerKm() {
        return 20;
    }
}

