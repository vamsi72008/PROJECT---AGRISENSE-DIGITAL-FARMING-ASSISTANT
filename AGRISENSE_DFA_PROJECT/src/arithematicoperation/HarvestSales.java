package arithematicoperation;
import java.util.Scanner;

public class HarvestSales {

    private int harvestId;
    private int cropId;
    private String harvestDate;
    private double harvestedQuantity;
    private double sellingPrice;
    private String buyerName;
    private String marketDetails;
    private double totalRevenue;

    public void recordHarvest(Scanner sc) {

        System.out.println("\n===== Record Harvest =====");

        System.out.print("Enter Harvest ID: ");
        harvestId = sc.nextInt();

        System.out.print("Enter Crop ID: ");
        cropId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Harvest Date: ");
        harvestDate = sc.nextLine();

        System.out.print("Enter Harvested Quantity (kg): ");
        harvestedQuantity = sc.nextDouble();

        System.out.print("Enter Selling Price per kg: ");
        sellingPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Buyer Name: ");
        buyerName = sc.nextLine();

        System.out.print("Enter Market Details: ");
        marketDetails = sc.nextLine();

        totalRevenue = harvestedQuantity * sellingPrice;

        System.out.println("\nHarvest recorded successfully.");
        System.out.println("Total Revenue: " + totalRevenue);
    }

    public void calculateRevenue() {

        totalRevenue = harvestedQuantity * sellingPrice;

        System.out.println("\n===== Revenue Calculation =====");

        System.out.println("Harvested Quantity : " + harvestedQuantity + " kg");
        System.out.println("Selling Price      : " + sellingPrice + " per kg");
        System.out.println("Total Revenue      : " + totalRevenue);
    }

    public void updateSales(Scanner sc) {

        System.out.println("\n===== Update Sales Information =====");

        System.out.print("Enter New Selling Price per kg: ");
        sellingPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter New Buyer Name: ");
        buyerName = sc.nextLine();

        System.out.print("Enter New Market Details: ");
        marketDetails = sc.nextLine();

        totalRevenue = harvestedQuantity * sellingPrice;

        System.out.println("\nSales information updated successfully.");
    }

    public void displayHarvest() {

        System.out.println("\n===== Harvest & Sales Details =====");

        System.out.println("Harvest ID          : " + harvestId);
        System.out.println("Crop ID             : " + cropId);
        System.out.println("Harvest Date        : " + harvestDate);
        System.out.println("Harvested Quantity  : " + harvestedQuantity + " kg");
        System.out.println("Selling Price       : " + sellingPrice + " per kg");
        System.out.println("Buyer Name          : " + buyerName);
        System.out.println("Market Details      : " + marketDetails);
        System.out.println("Total Revenue       : " + totalRevenue);
    }

    public void generateInvoice() {

        System.out.println("\n========================================");
        System.out.println("             AGRISENSE INVOICE");
        System.out.println("========================================");

        System.out.println("Harvest ID          : " + harvestId);
        System.out.println("Crop ID             : " + cropId);
        System.out.println("Harvest Date        : " + harvestDate);
        System.out.println("Buyer Name          : " + buyerName);
        System.out.println("Market Details      : " + marketDetails);
        System.out.println("----------------------------------------");
        System.out.println("Quantity            : " + harvestedQuantity + " kg");
        System.out.println("Price per kg        : " + sellingPrice);
        System.out.println("----------------------------------------");
        System.out.println("Total Revenue       : " + totalRevenue);
        System.out.println("========================================");
        System.out.println("        Thank you for using AgriSense!");
        System.out.println("========================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HarvestSales harvest = new HarvestSales();

        int choice;

        do {

            System.out.println("\n===== AGRISENSE - HARVEST & SALES MODULE =====");

            System.out.println("1. Record Harvest");
            System.out.println("2. Calculate Revenue");
            System.out.println("3. Update Sales");
            System.out.println("4. Display Harvest");
            System.out.println("5. Generate Invoice");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    harvest.recordHarvest(sc);
                    break;

                case 2:
                    harvest.calculateRevenue();
                    break;

                case 3:
                    sc.nextLine();
                    harvest.updateSales(sc);
                    break;

                case 4:
                    harvest.displayHarvest();
                    break;

                case 5:
                    harvest.generateInvoice();
                    break;

                case 0:
                    System.out.println("\nExiting Harvest & Sales Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

    }
}