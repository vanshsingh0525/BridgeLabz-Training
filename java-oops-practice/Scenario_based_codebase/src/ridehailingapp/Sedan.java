package ridehailingapp;

public class Sedan extends Vehicle {

    public Sedan(String number) {
        super(number, 4, "Sedan");
    }

    @Override
    public double getRatePerKm() {
        return 15;
    }
}

