package collections.set;

import java.util.*;

public class SetUnionIntersection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // -------- UNION --------
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // -------- INTERSECTION --------
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("\nSet 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

        sc.close();
    }
}
