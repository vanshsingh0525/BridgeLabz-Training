package ridehailingapp;

public class Mini extends Vehicle {

    public Mini(String number) {
        super(number, 4, "Mini");
    }

    @Override
    public double getRatePerKm() {
        return 10;
    }
}

