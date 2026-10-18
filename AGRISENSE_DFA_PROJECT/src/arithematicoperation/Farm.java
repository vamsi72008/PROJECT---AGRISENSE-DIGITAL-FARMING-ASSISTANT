package arithematicoperation;
import java.util.Scanner;

public class Farm {

    private int farmId;
    private int farmerId;
    private String farmLocation;
    private String soilType;
    private double cultivationArea;
    private String currentCrop;
    private String farmStatus;

    public void registerFarm(Scanner sc) {

        System.out.println("\n===== Farm Registration =====");

        System.out.print("Enter Farm ID: ");
        farmId = sc.nextInt();

        System.out.print("Enter Farmer ID: ");
        farmerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Farm Location: ");
        farmLocation = sc.nextLine();

        System.out.print("Enter Soil Type: ");
        soilType = sc.nextLine();

        System.out.print("Enter Cultivation Area: ");
        cultivationArea = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Current Crop: ");
        currentCrop = sc.nextLine();

        farmStatus = "Active";

        System.out.println("\nFarm registered successfully.");
    }

    public void updateFarm(Scanner sc) {

        System.out.println("\n===== Update Farm Information =====");

        System.out.print("Enter New Farm Location: ");
        farmLocation = sc.nextLine();

        System.out.print("Enter New Cultivation Area: ");
        cultivationArea = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Current Crop: ");
        currentCrop = sc.nextLine();

        System.out.print("Enter Farm Status: ");
        farmStatus = sc.nextLine();

        System.out.println("\nFarm information updated successfully.");
    }

    public void displayFarm() {

        System.out.println("\n===== Farm Details =====");

        System.out.println("Farm ID             : " + farmId);
        System.out.println("Farmer ID           : " + farmerId);
        System.out.println("Farm Location       : " + farmLocation);
        System.out.println("Soil Type           : " + soilType);
        System.out.println("Cultivation Area    : " + cultivationArea + " acres");
        System.out.println("Current Crop        : " + currentCrop);
        System.out.println("Farm Status         : " + farmStatus);
    }

    public void allocateCrop(Scanner sc) {

        System.out.println("\n===== Allocate Crop =====");

        System.out.print("Enter Crop Name to Allocate: ");
        currentCrop = sc.nextLine();

        System.out.println("\nCrop allocated to the farm successfully.");
        System.out.println("Current Crop: " + currentCrop);
    }

    public void updateSoilInformation(Scanner sc) {

        System.out.println("\n===== Update Soil Information =====");

        System.out.print("Enter New Soil Type: ");
        soilType = sc.nextLine();

        System.out.println("\nSoil information updated successfully.");
        System.out.println("Current Soil Type: " + soilType);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Farm farm = new Farm();

        int choice;

        do {

            System.out.println("\n===== AGRISENSE - FARM MANAGEMENT MODULE =====");

            System.out.println("1. Register Farm");
            System.out.println("2. Update Farm");
            System.out.println("3. Display Farm");
            System.out.println("4. Allocate Crop");
            System.out.println("5. Update Soil Information");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    farm.registerFarm(sc);
                    break;

                case 2:
                    sc.nextLine();
                    farm.updateFarm(sc);
                    break;

                case 3:
                    farm.displayFarm();
                    break;

                case 4:
                    sc.nextLine();
                    farm.allocateCrop(sc);
                    break;

                case 5:
                    sc.nextLine();
                    farm.updateSoilInformation(sc);
                    break;

                case 0:
                    System.out.println("\nExiting Farm Management Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

    }
}

