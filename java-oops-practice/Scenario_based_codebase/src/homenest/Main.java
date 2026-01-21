package homenest;

import java.util.*;

public class Main {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        List<Device> devices = new ArrayList<>();

	        System.out.print("Enter number of devices: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        for (int i = 0; i < n; i++) {

	            System.out.println("\nChoose device type:");
	            System.out.println("1. Light");
	            System.out.println("2. Camera");
	            System.out.println("3. Thermostat");
	            System.out.println("4. Lock");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Device ID: ");
	            String deviceId = sc.nextLine();

	            Device device = null;

	            switch (choice) {
	                case 1:
	                    device = new Light(deviceId);
	                    break;
	                case 2:
	                    device = new Camera(deviceId);
	                    break;
	                case 3:
	                    device = new Thermostat(deviceId);
	                    break;
	                case 4:
	                    device = new Lock(deviceId);
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    i--;
	                    continue;
	            }

	            devices.add(device);
	        }

	        System.out.println("\n--- Operating Devices ---");

	        for (Device d : devices) {
	            d.turnOn();
	            d.reset(); // polymorphic call
	            System.out.println("Energy for 2 hrs: " + d.calculateEnergy(2));
	            d.turnOff();
	            System.out.println("--------------------");
	        }

	        sc.close();
	    }
	
}