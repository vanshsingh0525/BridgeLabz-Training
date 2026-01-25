package collections.queue.hospital_triage_system;

package com.collections.queue_interface.hospital_triage_system;

import java.util.*;

public class HospitalTriageSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PriorityQueue with custom comparator (higher severity first)
        PriorityQueue<Patient> pq =
                new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter severity (1–10): ");
            int severity = sc.nextInt();
            sc.nextLine();

            pq.add(new Patient(name, severity));
        }

        System.out.println("\nTreatment Order:");
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }

        sc.close();
    }
}
