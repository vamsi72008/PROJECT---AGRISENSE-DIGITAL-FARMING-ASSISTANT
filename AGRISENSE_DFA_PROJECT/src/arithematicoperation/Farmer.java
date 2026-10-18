package arithematicoperation;
import java.util.Scanner;

public class Farmer {

    private int farmerId;
    private String farmerName;
    private String village;
    private String district;
    private long mobileNumber;
    private String email;
    private double landArea;
    private int farmingExperience;
    private boolean active;
    private String farmHistory;

    public void registerFarmer(Scanner sc) {

        System.out.println("\n===== Farmer Registration =====");

        System.out.print("Enter Farmer ID: ");
        farmerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Farmer Name: ");
        farmerName = sc.nextLine();

        System.out.print("Enter Village: ");
        village = sc.nextLine();

        System.out.print("Enter District: ");
        district = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        mobileNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Land Area: ");
        landArea = sc.nextDouble();

        System.out.print("Enter Farming Experience (years): ");
        farmingExperience = sc.nextInt();
        sc.nextLine();

        active = true;
        farmHistory = "Farmer registered successfully.";

        System.out.println("\nFarmer registered successfully.");
    }

    public void updateFarmer(Scanner sc) {

        if (!active) {
            System.out.println("Farmer account is inactive.");
            return;
        }

        System.out.println("\n===== Update Farmer Information =====");

        sc.nextLine();

        System.out.print("Enter New Farmer Name: ");
        farmerName = sc.nextLine();

        System.out.print("Enter New Village: ");
        village = sc.nextLine();

        System.out.print("Enter New District: ");
        district = sc.nextLine();

        System.out.print("Enter New Mobile Number: ");
        mobileNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter New Email: ");
        email = sc.nextLine();

        System.out.print("Enter New Land Area: ");
        landArea = sc.nextDouble();

        System.out.print("Enter New Farming Experience: ");
        farmingExperience = sc.nextInt();
        sc.nextLine();

        farmHistory = farmHistory + "\nFarmer information updated.";

        System.out.println("\nFarmer information updated successfully.");
    }

    public void displayFarmer() {

        if (!active) {
            System.out.println("\nFarmer account is inactive.");
            return;
        }

        System.out.println("\n===== Farmer Details =====");
        System.out.println("Farmer ID             : " + farmerId);
        System.out.println("Farmer Name           : " + farmerName);
        System.out.println("Village               : " + village);
        System.out.println("District              : " + district);
        System.out.println("Mobile Number         : " + mobileNumber);
        System.out.println("Email                 : " + email);
        System.out.println("Land Area             : " + landArea + " acres");
        System.out.println("Farming Experience    : " + farmingExperience + " years");
        System.out.println("Account Status        : Active");
    }

    public void viewFarmHistory() {

        System.out.println("\n===== Farm History =====");

        if (farmHistory == null || farmHistory.isEmpty()) {
            System.out.println("No farm history available.");
        } else {
            System.out.println(farmHistory);
        }
    }

    public void deactivateFarmer() {

        if (!active) {
            System.out.println("Farmer account is already inactive.");
            return;
        }

        active = false;
        farmHistory = farmHistory + "\nFarmer account deactivated.";

        System.out.println("\nFarmer account deactivated successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Farmer farmer = new Farmer();

        int choice;

        do {
            System.out.println("\n===== AGRISENSE - FARMER MODULE =====");
            System.out.println("1. Register Farmer");
            System.out.println("2. Update Farmer");
            System.out.println("3. Display Farmer");
            System.out.println("4. View Farm History");
            System.out.println("5. Deactivate Farmer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    farmer.registerFarmer(sc);
                    break;

                case 2:
                    farmer.updateFarmer(sc);
                    break;

                case 3:
                    farmer.displayFarmer();
                    break;

                case 4:
                    farmer.viewFarmHistory();
                    break;

                case 5:
                    farmer.deactivateFarmer();
                    break;

                case 0:
                    System.out.println("\nExiting Farmer Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}
