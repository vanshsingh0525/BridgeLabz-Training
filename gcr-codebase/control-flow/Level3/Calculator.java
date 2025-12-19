import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();
        // Perform calculation using switch-case
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } 
		else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
