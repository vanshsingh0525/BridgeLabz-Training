package sorting.tailorshop;

public class Order {

    int orderId;
    String customerName;
    int deadline;   // in days from today (e.g., 1, 2, 3...)

    public Order(int orderId, String customerName, int deadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deadline = deadline;
    }

    public void display() {
        System.out.println(orderId + " | " + customerName + " | Deadline: " + deadline + " days");
    }
}
