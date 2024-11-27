//14-a Write a java program for implementing multiple inheritance in java

// Interface for displaying personal details
interface PersonalDetails {
    void displayPersonalDetails();
}

// Interface for displaying job details
interface JobDetails {
    void displayJobDetails();
}

// Employee class implementing both interfaces (achieving multiple inheritance)
class Employee implements PersonalDetails, JobDetails {
    String name;
    int age;
    String jobTitle;
    double salary;

    // Constructor to initialize employee details
    public Employee(String name, int age, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Implementation of displayPersonalDetails() from PersonalDetails interface
    public void displayPersonalDetails() {
        System.out.println("Employee Personal Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Implementation of displayJobDetails() from JobDetails interface
    public void displayJobDetails() {
        System.out.println("\nEmployee Job Details:");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 30, "Software Engineer", 70000);

        // Call methods to display details
        emp.displayPersonalDetails();
        emp.displayJobDetails();
    }
}


// OUTPUT:
// Employee Personal Details:
// Name: John Doe
// Age: 30

// Employee Job Details:
// Job Title: Software Engineer
// Salary: 70000.0


