import java.util.Scanner;
public class MyMain {
    public static void main(String[] args){
        Staff staffMember = new Staff("amy", "password1");
        Manager manager = new Manager("stacy", "password2");
        User user = validateUser(staffMember, manager);
        if(user != null){
            displayMenu(user);
        }else{
            System.out.println("Invalid.");
        }
    }
    private static Staff validateUser(Staff staff, Manager manager){
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String enteredUsername = input.nextLine();
        System.out.print("Password: ");
        String enteredPassword = input.nextLine();
        if (staff.authenticate(enteredPassword) && staff.getUsername().equals(enteredUsername)){
            System.out.println("Welcome, " + staff.getUsername());
            return staff;
        }else if (manager.authenticate(enteredPassword) && manager.getUsername().equals(enteredUsername)){
            System.out.println("Welcome, " + manager.getUsername());
            return manager;
        } else{
            System.out.println("Invalid password");
            return null;
        }
    }
    public static void displayMenu(User user){
        Scanner input = new Scanner(System.in);
        System.out.println("1. View customer details: ");
        System.out.println("2. Update customer details: ");
        System.out.println("2. Create a new customer (prepay): ");
        System.out.println("3. Create a new customer (billpay): ");
        System.out.println("4. Upgrade an existing customer: ");
        if (user instanceof Manager){
            System.out.println("5. Downgrade an existing customer: ");
        }
        int menu = input.nextInt();
        switch(menu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
}