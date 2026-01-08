package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author,
                 double price, int stock, double discount) {

        super(title, author, price, stock, discount);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        double extraDigitalDiscount = 5;
        return total - (total * (discount + extraDigitalDiscount) / 100);
    }
}
