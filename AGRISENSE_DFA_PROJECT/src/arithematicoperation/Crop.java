package arithematicoperation;
import java.util.Scanner;

public class Crop {

    private int cropId;
    private String cropName;
    private String cropVariety;
    private String sowingDate;
    private String expectedHarvestDate;
    private String fertilizerType;
    private String cropStatus;
    private String pesticideUsage;

    public void registerCrop(Scanner sc) {

        System.out.println("\n===== Crop Registration =====");

        System.out.print("Enter Crop ID: ");
        cropId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Crop Name: ");
        cropName = sc.nextLine();

        System.out.print("Enter Crop Variety: ");
        cropVariety = sc.nextLine();

        System.out.print("Enter Sowing Date: ");
        sowingDate = sc.nextLine();

        System.out.print("Enter Expected Harvest Date: ");
        expectedHarvestDate = sc.nextLine();

        System.out.print("Enter Fertilizer Type: ");
        fertilizerType = sc.nextLine();

        cropStatus = "Sown";
        pesticideUsage = "No pesticide usage recorded.";

        System.out.println("\nCrop registered successfully.");
    }

    public void updateCrop(Scanner sc) {

        System.out.println("\n===== Update Crop Information =====");

        System.out.print("Enter New Crop Name: ");
        cropName = sc.nextLine();

        System.out.print("Enter New Crop Variety: ");
        cropVariety = sc.nextLine();

        System.out.print("Enter New Sowing Date: ");
        sowingDate = sc.nextLine();

        System.out.print("Enter New Expected Harvest Date: ");
        expectedHarvestDate = sc.nextLine();

        System.out.print("Enter New Fertilizer Type: ");
        fertilizerType = sc.nextLine();

        System.out.println("\nCrop information updated successfully.");
    }

    public void displayCrop() {

        System.out.println("\n===== Crop Details =====");

        System.out.println("Crop ID                 : " + cropId);
        System.out.println("Crop Name               : " + cropName);
        System.out.println("Crop Variety            : " + cropVariety);
        System.out.println("Sowing Date             : " + sowingDate);
        System.out.println("Expected Harvest Date   : " + expectedHarvestDate);
        System.out.println("Fertilizer Type         : " + fertilizerType);
        System.out.println("Crop Status             : " + cropStatus);
        System.out.println("Pesticide Usage         : " + pesticideUsage);
    }

    public void updateGrowthStatus(Scanner sc) {

        System.out.println("\n===== Update Growth Status =====");

        System.out.println("1. Sown");
        System.out.println("2. Growing");
        System.out.println("3. Flowering");
        System.out.println("4. Harvest Ready");
        System.out.println("5. Harvested");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                cropStatus = "Sown";
                break;

            case 2:
                cropStatus = "Growing";
                break;

            case 3:
                cropStatus = "Flowering";
                break;

            case 4:
                cropStatus = "Harvest Ready";
                break;

            case 5:
                cropStatus = "Harvested";
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Crop growth status updated successfully.");
    }

    public void recordPesticideUsage(Scanner sc) {

        System.out.println("\n===== Record Pesticide Usage =====");

        System.out.print("Enter Pesticide Name and Usage Details: ");
        pesticideUsage = sc.nextLine();

        System.out.println("\nPesticide usage recorded successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Crop crop = new Crop();

        int choice;

        do {

            System.out.println("\n===== AGRISENSE - CROP MANAGEMENT MODULE =====");

            System.out.println("1. Register Crop");
            System.out.println("2. Update Crop");
            System.out.println("3. Display Crop");
            System.out.println("4. Update Growth Status");
            System.out.println("5. Record Pesticide Usage");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    crop.registerCrop(sc);
                    break;

                case 2:
                    sc.nextLine();
                    crop.updateCrop(sc);
                    break;

                case 3:
                    crop.displayCrop();
                    break;

                case 4:
                    crop.updateGrowthStatus(sc);
                    break;

                case 5:
                    sc.nextLine();
                    crop.recordPesticideUsage(sc);
                    break;

                case 0:
                    System.out.println("\nExiting Crop Management Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}

