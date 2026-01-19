package sorting.eduresults;

import java.util.Scanner;

public class EduResultApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            students[i] = new Student(roll, name, marks);
        }

        // Sorting using Merge Sort
        MergeSortUtil.mergeSort(students, 0, n - 1);

        System.out.println("\n Final State-Wise Rank List:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + students[i]);
        }

        sc.close();
    }
}
