package bookbazaar;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private String orderStatus;
    private List<Book> books;
    private List<Integer> quantities;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderStatus = "CREATED";
        this.books = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            books.add(book);
            quantities.add(quantity);
        } else {
            System.out.println("Insufficient stock for " + book.title);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            total += books.get(i).applyDiscount(quantities.get(i));
        }
        return total;
    }

    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}

