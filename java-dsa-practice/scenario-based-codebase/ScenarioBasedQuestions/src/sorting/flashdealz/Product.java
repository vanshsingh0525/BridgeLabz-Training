package sorting.flashdealz;

public class Product {
    int productId;
    String productName;
    double discount;

    public Product(int productId, String productName, double discount) {
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return productId + " | " + productName + " | " + discount + "%";
    }
}
