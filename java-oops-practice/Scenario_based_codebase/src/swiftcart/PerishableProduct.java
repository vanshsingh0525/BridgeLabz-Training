package swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }

    @Override
    public double getDiscount() {
        return getTotalPrice() * 0.10; // 10% discount
    }
}

