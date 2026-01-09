package foodloop;

import java.util.ArrayList;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem pizza = new VegItem("Veg Pizza", 250, 5);
        FoodItem burger = new NonVegItem("Chicken Burger", 180, 3);
        FoodItem pasta = new VegItem("White Sauce Pasta", 200, 4);

        ArrayList<FoodItem> combo = new ArrayList<>();
        combo.add(pizza);
        combo.add(burger);

        Order order = new Order(combo);
        order.addItem(pasta);

        order.placeOrder();
    }
}
