package swiftcart;

public class Product {

    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Polymorphic discount method
    public double getDiscount() {
        return 0; // default: no discount
    }

    public double getTotalPrice() {
        return price * quantity; // operator usage
    }
}

