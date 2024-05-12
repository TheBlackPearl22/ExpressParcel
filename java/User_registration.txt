import java.util.Scanner;

public class CustomerRegistration {
    private String customerName;
    private String email;
    private String countryCode;
    private String mobileNumber;
    private String address;
    private String userID;
    private String password;
    private String confirmPassword;
    private String preferences;

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Registration");

        System.out.print("Customer Name (Max 50 characters): ");
        this.customerName = scanner.nextLine();

        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.println("Select Country Code:");
        // Here, you can provide options for country code selection using a select box
        // For simplicity, let's assume the user directly inputs the country code
        this.countryCode = scanner.nextLine();

        System.out.print("Enter Mobile Number (10 digits): ");
        this.mobileNumber = scanner.nextLine();

        System.out.print("Address: ");
        this.address = scanner.nextLine();

        System.out.print("User ID (Min 5, Max 20 characters): ");
        this.userID = scanner.nextLine();

        System.out.print("Password (Max 30 characters): ");
        this.password = scanner.nextLine();

        System.out.print("Confirm Password: ");
        this.confirmPassword = scanner.nextLine();

        System.out.print("Specify preferences: ");
        this.preferences = scanner.nextLine();

        System.out.println("Registration Successful!");
    }

    public static void main(String[] args) {
        CustomerRegistration customer = new CustomerRegistration();
        customer.register();
    }
}
