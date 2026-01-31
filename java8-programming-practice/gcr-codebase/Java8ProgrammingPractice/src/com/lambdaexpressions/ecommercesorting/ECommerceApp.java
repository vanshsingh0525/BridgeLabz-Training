package com.lambdaexpressions.ecommercesorting;
import java.util.*;

public class ECommerceApp {

	public static void main(String[] args) {

//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Laptop", 65000, 4.5, 10));
//        products.add(new Product("Phone", 30000, 4.8, 15));
//        products.add(new Product("Headphones", 3000, 4.2, 25));

        List<Product> products = Arrays.asList(
        	    new Product("Phone", 500, 4.5, 10),
        	    new Product("Laptop", 1000, 4.8, 15),
        	    new Product("Headphones", 100, 4.2, 5)
        	);

        products.sort((p1,p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);
    }
}
