//41. Create a doctor class with attributes id,name,year department using parametrized constructor.check whether age is in between 25 to 65 .
// If not throw a user defined exception.
// then if name contains any special characters or symbols throw a invalidname exception .define the two exceptions

// Exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Exception for invalid name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

// Doctor class
class Doctor {
    private int id;
    private String name;
    private int year;
    private String department;

    // Parameterized constructor
    public Doctor(int id, String name, int year, String department) throws InvalidAgeException, InvalidNameException {
        this.id = id;
        this.name = name;
        this.year = year;
        this.department = department;

        // Check for valid age
        int age = 2024 - year;  // Assuming current year is 2024
        if (age < 25 || age > 65) {
            throw new InvalidAgeException("Age must be between 25 and 65. Current age is: " + age);
        }

        // Check for valid name
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidNameException("Name contains invalid characters: " + name);
        }
    }

    // Method to display doctor details
    public void displayDetails() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Doctor Name: " + name);
        System.out.println("Year of Birth: " + year);
        System.out.println("Department: " + department);
    }
}

// Main class to test Doctor class
public class DoctorTest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            // Get doctor details from user
            System.out.print("Enter Doctor ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // Consume the newline

            System.out.print("Enter Doctor Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Doctor Year of Birth: ");
            int year = sc.nextInt();
            sc.nextLine();  // Consume the newline

            System.out.print("Enter Doctor Department: ");
            String department = sc.nextLine();

            // Create Doctor object
            Doctor doctor = new Doctor(id, name, year, department);

            // Display doctor details
            doctor.displayDetails();
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}



// OUTPUT:
// Enter Doctor ID: 101
// Enter Doctor Name: John Doe
// Enter Doctor Year of Birth: 1985
// Enter Doctor Department: Cardiology
// Doctor ID: 101
// Doctor Name: John Doe
// Year of Birth: 1985
// Department: Cardiology



// Enter Doctor ID: 102
// Enter Doctor Name: Jane Smith
// Enter Doctor Year of Birth: 2000
// Enter Doctor Department: Neurology
// Error: Age must be between 25 and 65. Current age is: 24



// Enter Doctor ID: 103
// Enter Doctor Name: John@Doe
// Enter Doctor Year of Birth: 1980
// Enter Doctor Department: Orthopedics
// Error: Name contains invalid characters: John@Doe
  
  
