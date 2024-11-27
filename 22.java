//22. Create a interface studentfee with method getamount(),getfirstname(),getlastname(),getaddress, getcontact(), getamount(). 
// calculate the fees paid by the hosteller and non hosteller.
// Implement the interface studentfee

// Interface StudentFee
interface StudentFee {
    double getAmount();         // Method to get the fee amount
    String getFirstName();      // Method to get the first name
    String getLastName();       // Method to get the last name
    String getAddress();        // Method to get the address
    String getContact();        // Method to get the contact number
}

// Hosteller class implements StudentFee interface
class Hosteller implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double hostelFee;

    // Constructor
    public Hosteller(String firstName, String lastName, String address, String contact, double hostelFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.hostelFee = hostelFee;
    }

    // Implementing methods from StudentFee interface
    @Override
    public double getAmount() {
        return 5000 + hostelFee;  // Basic fee + hostel fee
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

// NonHosteller class implements StudentFee interface
class NonHosteller implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double transportationFee;

    // Constructor
    public NonHosteller(String firstName, String lastName, String address, String contact, double transportationFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.transportationFee = transportationFee;
    }

    // Implementing methods from StudentFee interface
    @Override
    public double getAmount() {
        return 5000 + transportationFee;  // Basic fee + transportation fee
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

// Main class to test StudentFee implementation
public class StudentFeeTest {
    public static void main(String[] args) {
        // Create Hosteller and Non-Hosteller students
        Hosteller hosteller = new Hosteller("John", "Doe", "123 Main St, City", "123-456-7890", 2000);
        NonHosteller nonHosteller = new NonHosteller("Jane", "Smith", "456 Park Ave, City", "987-654-3210", 1000);

        // Displaying details and fee calculation for Hosteller
        System.out.println("Hosteller Details:");
        System.out.println("Name: " + hosteller.getFirstName() + " " + hosteller.getLastName());
        System.out.println("Address: " + hosteller.getAddress());
        System.out.println("Contact: " + hosteller.getContact());
        System.out.println("Total Fee: " + hosteller.getAmount());
        System.out.println();

        // Displaying details and fee calculation for Non-Hosteller
        System.out.println("Non-Hosteller Details:");
        System.out.println("Name: " + nonHosteller.getFirstName() + " " + nonHosteller.getLastName());
        System.out.println("Address: " + nonHosteller.getAddress());
        System.out.println("Contact: " + nonHosteller.getContact());
        System.out.println("Total Fee: " + nonHosteller.getAmount());
    }
}



// OUTPUT:
// Hosteller Details:
// Name: John Doe
// Address: 123 Main St, City
// Contact: 123-456-7890
// Total Fee: 7000.0

// Non-Hosteller Details:
// Name: Jane Smith
// Address: 456 Park Ave, City
// Contact: 987-654-3210
// Total Fee: 6000.0
