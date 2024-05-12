import java.util.Scanner;

public class UserAuthentication {
    // Assume role is stored as a string
    private String role;

    public void displayMenu() {
        System.out.println("Menu:");

        switch (role) {
            case "Admin":
                System.out.println("1. Home");
                System.out.println("2. Booking service");
                System.out.println("3. Tracking");
                System.out.println("4. Previous Booking");
                System.out.println("5. Contact Support");
                System.out.println("6. Logout");
                break;
            case "User":
                System.out.println("1. Home");
                System.out.println("2. Booking service");
                System.out.println("3. Tracking");
                System.out.println("4. Previous Booking");
                System.out.println("5. Contact Support");
                System.out.println("6. Logout");
                break;
            // Add cases for other roles as needed
            default:
                System.out.println("Unknown role");
        }
    }

    // Other methods for authentication, login, etc.

    public static void main(String[] args) {
        // Assume user is successfully authenticated and role is assigned
        UserAuthentication userAuth = new UserAuthentication();
        userAuth.role = "Admin"; // Assign the user's role here
        userAuth.displayMenu();
    }
}
