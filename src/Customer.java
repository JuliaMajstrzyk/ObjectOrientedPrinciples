import java.util.Scanner;
public class Customer {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String DOB;
    public Customer(String fname, String lname, int pn, String DOB) {
        this.firstName = fname;
        this.lastName = lname;
        this.phoneNumber = pn;
        this.DOB = DOB;
    }
    // Getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getDOB() {
        return DOB;
    }
    // Setter methods for updating details
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public void displayDetails() {
        System.out.println("Customer Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Birth: " + DOB);
    }
    public void updateDetails(Scanner input) {
        System.out.print("Enter new first name: ");
        setFirstName(input.next());

        System.out.print("Enter new last name: ");
        setLastName(input.next());

        System.out.print("Enter new phone number: ");
        setPhoneNumber(input.nextInt());

        System.out.print("Enter new date of birth: ");
        setDOB(input.next());

        System.out.println("Customer details updated successfully!");
    }
}
