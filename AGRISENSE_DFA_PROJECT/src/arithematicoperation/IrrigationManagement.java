package arithematicoperation;
import java.util.Scanner;

public class IrrigationManagement {

    private int irrigationId;
    private int farmId;
    private String irrigationMethod;
    private String irrigationDate;
    private double waterQuantity;
    private String fertilizerApplied;
    private String irrigationStatus;
    private String resourceUsage;

    public void scheduleIrrigation(Scanner sc) {

        System.out.println("\n===== Schedule Irrigation =====");

        System.out.print("Enter Irrigation ID: ");
        irrigationId = sc.nextInt();

        System.out.print("Enter Farm ID: ");
        farmId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Irrigation Method (Drip/Sprinkler/Flood): ");
        irrigationMethod = sc.nextLine();

        System.out.print("Enter Irrigation Date: ");
        irrigationDate = sc.nextLine();

        System.out.print("Enter Water Quantity (litres): ");
        waterQuantity = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Fertilizer Applied: ");
        fertilizerApplied = sc.nextLine();

        irrigationStatus = "Scheduled";
        resourceUsage = "No resource usage recorded.";

        System.out.println("\nIrrigation scheduled successfully.");
    }

    public void updateIrrigation(Scanner sc) {

        System.out.println("\n===== Update Irrigation =====");

        System.out.print("Enter New Irrigation Method: ");
        irrigationMethod = sc.nextLine();

        System.out.print("Enter New Irrigation Date: ");
        irrigationDate = sc.nextLine();

        System.out.print("Enter New Water Quantity (litres): ");
        waterQuantity = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Fertilizer Applied: ");
        fertilizerApplied = sc.nextLine();

        System.out.print("Enter Irrigation Status: ");
        irrigationStatus = sc.nextLine();

        System.out.println("\nIrrigation information updated successfully.");
    }

    public void displayIrrigation() {

        System.out.println("\n===== Irrigation Details =====");

        System.out.println("Irrigation ID       : " + irrigationId);
        System.out.println("Farm ID             : " + farmId);
        System.out.println("Irrigation Method   : " + irrigationMethod);
        System.out.println("Irrigation Date     : " + irrigationDate);
        System.out.println("Water Quantity      : " + waterQuantity + " litres");
        System.out.println("Fertilizer Applied  : " + fertilizerApplied);
        System.out.println("Irrigation Status   : " + irrigationStatus);
        System.out.println("Resource Usage      : " + resourceUsage);
    }

    public void calculateWaterUsage() {

        System.out.println("\n===== Water Usage Calculation =====");

        System.out.println("Farm ID             : " + farmId);
        System.out.println("Irrigation Method   : " + irrigationMethod);
        System.out.println("Water Used          : " + waterQuantity + " litres");

        if (waterQuantity <= 1000) {
            System.out.println("Water Usage Level   : Low");
        } else if (waterQuantity <= 5000) {
            System.out.println("Water Usage Level   : Moderate");
        } else {
            System.out.println("Water Usage Level   : High");
        }
    }

    public void recordResourceUsage(Scanner sc) {

        System.out.println("\n===== Record Resource Usage =====");

        System.out.print("Enter Fertilizer/Pesticide/Equipment Usage Details: ");
        resourceUsage = sc.nextLine();

        System.out.println("\nResource usage recorded successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IrrigationManagement irrigation = new IrrigationManagement();

        int choice;

        do {

            System.out.println("\n===== AGRISENSE - IRRIGATION & RESOURCE MANAGEMENT =====");

            System.out.println("1. Schedule Irrigation");
            System.out.println("2. Update Irrigation");
            System.out.println("3. Display Irrigation");
            System.out.println("4. Calculate Water Usage");
            System.out.println("5. Record Resource Usage");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    irrigation.scheduleIrrigation(sc);
                    break;

                case 2:
                    sc.nextLine();
                    irrigation.updateIrrigation(sc);
                    break;

                case 3:
                    irrigation.displayIrrigation();
                    break;

                case 4:
                    irrigation.calculateWaterUsage();
                    break;

                case 5:
                    sc.nextLine();
                    irrigation.recordResourceUsage(sc);
                    break;

                case 0:
                    System.out.println("\nExiting Irrigation & Resource Management Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

    }
}