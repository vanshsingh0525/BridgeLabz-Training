import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant for number of days
        final int DAYS = 7;
        // Array to store temperatures for 7 days
        double[] temperatures = new double[DAYS];
        // Variable to store sum of temperatures
        double sum = 0.0;
        // for-loop to record temperatures and calculate sum
        for (int i = 0; i < DAYS; i++) {
            temperatures[i] = scanner.nextDouble();
            sum = sum + temperatures[i];
        }

        // Calculate average temperature
        double averageTemperature = sum / DAYS;
        double maxTemperature = temperatures[0];
        for (int i = 1; i < DAYS; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        // Display average and maximum temperature
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Maximum Temperature: " + maxTemperature);
    }
}
