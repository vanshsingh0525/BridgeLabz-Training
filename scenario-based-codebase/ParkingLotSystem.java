import java.util.Scanner;

public class ParkingLotSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximum parking capacity
        int capacity = 5;
        // Current number of parked vehicles
        int occupied = 0;
        // Variable to store user choice
        int choice;

        while (occupied < capacity) {

            // Display menu options
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Park a vehicle if space is available
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    }
                    break;

                case 2:
                    // Exit a vehicle if parking is not empty
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    }
                    break;

                case 3:
                    // Show current parking occupancy
                    System.out.println("Occupied Spaces: " + occupied);
                    System.out.println("Available Spaces: " + (capacity - occupied));
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
        System.out.println("Parking lot is full.");
    }
}
