package sorting.cropmonitor;

import java.util.Scanner;

public class CropMonitor {

    // Quick Sort function
    public static void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    // Partition logic based on timestamp
    private static int partition(SensorData[] data, int low, int high) {
        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp <= pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    // Swap helper
    private static void swap(SensorData[] data, int i, int j) {
        SensorData temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // Display sorted data
    public static void display(SensorData[] data) {
        for (SensorData d : data) {
            System.out.println(
                "Time: " + d.timestamp + " | Temp: " + d.temperature
            );
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorData[] readings = new SensorData[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter timestamp: ");
            long time = sc.nextLong();

            System.out.print("Enter temperature: ");
            double temp = sc.nextDouble();

            readings[i] = new SensorData(time, temp);
        }

        System.out.println("\nBefore Sorting:");
        CropMonitor.display(readings);

        CropMonitor.quickSort(readings, 0, n - 1);

        System.out.println("\nAfter Sorting (By Timestamp):");
        CropMonitor.display(readings);

        sc.close();
    }
}
