package bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author,
                       double price, int stock, double discount) {

        super(title, author, price, stock, discount);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}
