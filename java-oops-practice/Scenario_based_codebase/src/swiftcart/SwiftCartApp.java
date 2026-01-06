package swiftcart;

import java.util.ArrayList;

public class SwiftCartApp {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50, 2);
        Product rice = new NonPerishableProduct("Rice", 60, 5);

        ArrayList<Product> initialItems = new ArrayList<>();
        initialItems.add(milk);
        initialItems.add(rice);

        Cart cart = new Cart(initialItems);

        cart.applyDiscount(50); // coupon discount
        cart.generateBill();
    }
}

