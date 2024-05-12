import java.util.Scanner;

public class UserAuthentication {
    private String role;

    public void displayMenu() {
        System.out.println("Menu:");

        switch (role) {
            case "Admin":
                System.out.println("1. Home");
                System.out.println("2. Tracking");
                System.out.println("3. Delivery Status");
                System.out.println("4. Pickup Scheduling");
                System.out.println("5. Previous Booking");
                System.out.println("6. Logout");
                break;
            case "User":
                System.out.println("1. Home");
                System.out.println("2. Tracking");
                System.out.println("3. Delivery Status");
                System.out.println("4. Pickup Scheduling");
                System.out.println("5. Previous Booking");
                System.out.println("6. Logout");
                break;
            // Add cases for other roles as needed
            default:
                System.out.println("Unknown role");
        }
    }

    public void redirectOption(int option) {
        switch (option) {
            case 1:
                // Redirect to home page
                System.out.println("Redirecting to Home...");
                break;
            case 2:
                // Redirect to tracking screen
                System.out.println("Redirecting to Tracking Screen...");
                break;
            case 3:
                // Redirect to delivery status screen
                System.out.println("Redirecting to Delivery Status Screen...");
                break;
            case 4:
                // Redirect to pickup scheduling screen
                System.out.println("Redirecting to Pickup Scheduling Screen...");
                break;
            case 5:
                // Redirect to previous booking screen
                System.out.println("Redirecting to Previous Booking Screen...");
                break;
            case 6:
                // Logout
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {
        UserAuthentication userAuth = new UserAuthentication();
        userAuth.role = "Admin"; // Assuming user is authenticated and role is assigned

        // Display menu
        userAuth.displayMenu();

        // Simulate user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        // Redirect based on option
        userAuth.redirectOption(option);
    }
}
