package bookbazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book book1 = new PrintedBook(
                "Clean Code", "Robert Martin",
                500, 10, 10);

        Book book2 = new EBook(
                "Effective Java", "Joshua Bloch",
                400, 50, 15);

        Order order = new Order(101);

        order.addBook(book1, 2);
        order.addBook(book2, 1);

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Total Amount: " + order.calculateTotal());
    }
}

