package collections.set.policy_management_system;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        while (true) {
            System.out.println("""
            
             Insurance Policy Management
            1. Add Policy
            2. Display All Policies
            3. Policies Expiring in Next 30 Days
            4. Policies by Coverage Type
            5. Performance Comparison
            6. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Policy Number: ");
                    String number = sc.nextLine();

                    System.out.print("Policy Holder Name: ");
                    String holder = sc.nextLine();

                    System.out.print("Coverage Type (Health/Auto/Home): ");
                    String coverage = sc.nextLine();

                    System.out.print("Expiry Date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Premium Amount: ");
                    double premium = sc.nextDouble();
                    sc.nextLine();

                    Policy p = new Policy(number, holder, date, coverage, premium);

                    hashSet.add(p);
                    linkedHashSet.add(p);
                    treeSet.add(p);

                    System.out.println("Policy added successfully.");
                }

                case 2 -> {
                    System.out.println("\nAll Policies:");
                    hashSet.forEach(System.out::println);
                }

                case 3 -> {
                    LocalDate today = LocalDate.now();
                    System.out.println("\nPolicies expiring in next 30 days:");
                    for (Policy p : hashSet) {
                        if (!p.getExpiryDate().isAfter(today.plusDays(30))) {
                            System.out.println(p);
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Enter coverage type: ");
                    String type = sc.nextLine();

                    System.out.println("\nPolicies with coverage " + type + ":");
                    for (Policy p : hashSet) {
                        if (p.getCoverageType().equalsIgnoreCase(type)) {
                            System.out.println(p);
                        }
                    }
                }

                case 5 -> {
                    Policy test = new Policy(
                            "TEMP", "Test",
                            LocalDate.now().plusDays(10),
                            "Health", 5000
                    );

                    long start, end;

                    start = System.nanoTime();
                    hashSet.add(test);
                    hashSet.contains(test);
                    hashSet.remove(test);
                    end = System.nanoTime();
                    System.out.println("HashSet time: " + (end - start));

                    start = System.nanoTime();
                    linkedHashSet.add(test);
                    linkedHashSet.contains(test);
                    linkedHashSet.remove(test);
                    end = System.nanoTime();
                    System.out.println("LinkedHashSet time: " + (end - start));

                    start = System.nanoTime();
                    treeSet.add(test);
                    treeSet.contains(test);
                    treeSet.remove(test);
                    end = System.nanoTime();
                    System.out.println("TreeSet time: " + (end - start));
                }

                case 6 -> {
                    System.out.println("Exiting system 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
	
}
