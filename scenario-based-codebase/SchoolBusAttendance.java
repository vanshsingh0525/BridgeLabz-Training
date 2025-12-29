import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store names of 10 students
        String[] students = {
            "Student1", "Student2", "Student3", "Student4", "Student5",
            "Student6", "Student7", "Student8", "Student9", "Student10"
        };

        // Variables to count present and absent students
        int presentCount = 0;
        int absentCount = 0;

        // for-each loop to iterate over student names
        for (String student : students) {
            System.out.println(student + " - Present or Absent?");
            String status = scanner.nextLine();

            // Check attendance status
            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Print total present and absent counts
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);
    }
}

