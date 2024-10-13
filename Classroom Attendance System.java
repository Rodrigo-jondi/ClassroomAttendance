import java.util.Scanner;

public class ClassroomAttendanceSystem {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

        // Initialize counters for present and absent students
        int presentCount = 0;
        int absentCount = 0;

        // Loop through each student to take attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().charAt(0);

            // Check if the student is present or absent
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter Y for present or N for absent.");
                i--; // Repeat the input for the same student if input is invalid
            }
        }

        // Display the final counts for present and absent students
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
    }
}