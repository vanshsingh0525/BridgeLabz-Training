package medistore;

import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine tablet = new Tablet(
                "Paracetamol", 5.0,
                LocalDate.of(2026, 5, 10));

        Medicine syrup = new Syrup(
                "Cough Syrup", 80.0,
                LocalDate.of(2026, 2, 1));

        Medicine injection = new Injection(
                "Insulin", 250.0,
                LocalDate.of(2026, 1, 15));

        System.out.println("Tablet Bill: " + tablet.sell(12));
        System.out.println("Remaining Stock: " + tablet.getQuantity());

        System.out.println();

        System.out.println("Syrup Bill: " + syrup.sell(2));
        System.out.println("Injection Bill: " + injection.sell(1));
    }
}
