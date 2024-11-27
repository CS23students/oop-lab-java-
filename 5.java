// Develop the internal marks calculation system based on the attendence percentage using Java get the students name, register number, total number of working days in the semester and number of days present.
// Calculate the attendence percentage of the students and answer attendance Mark based on the following conditions
// Attendence percentage>90-5 marks
// Attendence percentage>80 and <90-4 marks
// Attendence percentage>75 and <80-3 marks
// Attendence percentage<75-0 marks using inheritance

import java.util.Scanner;

// Base class for Student
class Student {
    String name;
    String registerNumber;
    int totalWorkingDays;
    int daysPresent;

    // Constructor to initialize student details
    public Student(String name, String registerNumber, int totalWorkingDays, int daysPresent) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
    }

    // Method to calculate attendance percentage
    public double calculateAttendancePercentage() {
        return ((double) daysPresent / totalWorkingDays) * 100;
    }
}

// Subclass for calculating attendance marks
class AttendanceMarks extends Student {

    // Constructor to initialize the student details by calling the parent constructor
    public AttendanceMarks(String name, String registerNumber, int totalWorkingDays, int daysPresent) {
        super(name, registerNumber, totalWorkingDays, daysPresent);
    }

    // Method to calculate attendance marks based on attendance percentage
    public int calculateAttendanceMarks() {
        double percentage = calculateAttendancePercentage();
        int marks = 0;

        // Assign marks based on attendance percentage
        if (percentage > 90) {
            marks = 5;
        } else if (percentage > 80 && percentage <= 90) {
            marks = 4;
        } else if (percentage > 75 && percentage <= 80) {
            marks = 3;
        } else if (percentage <= 75) {
            marks = 0;
        }

        return marks;
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get student details
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Register Number: ");
        String registerNumber = sc.nextLine();

        System.out.println("Enter Total Number of Working Days in the Semester: ");
        int totalWorkingDays = sc.nextInt();

        System.out.println("Enter Number of Days Present: ");
        int daysPresent = sc.nextInt();

        // Create an object of AttendanceMarks class (which inherits Student class)
        AttendanceMarks student = new AttendanceMarks(name, registerNumber, totalWorkingDays, daysPresent);

        // Calculate attendance marks based on attendance percentage
        int marks = student.calculateAttendanceMarks();

        // Display the results
        System.out.println("\n--- Attendance Mark System ---");
        System.out.println("Student Name: " + student.name);
        System.out.println("Register Number: " + student.registerNumber);
        System.out.println("Total Working Days: " + student.totalWorkingDays);
        System.out.println("Days Present: " + student.daysPresent);
        System.out.printf("Attendance Percentage: %.2f%%\n", student.calculateAttendancePercentage());
        System.out.println("Attendance Marks: " + marks);

        sc.close();
    }
}


// OUTPUT :
// Enter Student Name: 
// John Doe
// Enter Register Number: 
// 12345
// Enter Total Number of Working Days in the Semester: 
// 100
// Enter Number of Days Present: 
// 85

// --- Attendance Mark System ---
// Student Name: John Doe
// Register Number: 12345
// Total Working Days: 100
// Days Present: 85
// Attendance Percentage: 85.00%
// Attendance Marks: 4
