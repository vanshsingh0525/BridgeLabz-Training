package bookbazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;          // Encapsulated inventory
    protected double discount;  // Optional offer

    // Constructor without discount
    public Book(String title, String author, double price, int stock) {
        this(title, author, price, stock, 0);
    }

    // Constructor with discount
    public Book(String title, String author, double price,
                int stock, double discount) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    // Controlled stock access
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}

