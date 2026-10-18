package arithematicoperation;
import java.util.Scanner;
public class ReportGenerationService {

    private String farmerName;
    private int farmerId;
    private String village;
    private double landArea;

    private int cropId;
    private String cropName;
    private String cropVariety;
    private String cropStatus;

    private int harvestId;
    private double harvestedQuantity;
    private double sellingPrice;
    private double totalRevenue;

    private String reportTitle;

    public ReportGenerationService() {

        farmerId = 101;
        farmerName = "Ramesh";
        village = "Nellore";
        landArea = 5.5;

        cropId = 201;
        cropName = "Rice";
        cropVariety = "Basmati";
        cropStatus = "Harvest Ready";

        harvestId = 301;
        harvestedQuantity = 2500;
        sellingPrice = 40;
        totalRevenue = harvestedQuantity * sellingPrice;
    }

    public void generateFarmerReport() {

        reportTitle = "FARMER REPORT";

        System.out.println("\n==========================================");
        System.out.println("             " + reportTitle);
        System.out.println("==========================================");

        System.out.println("Farmer ID       : " + farmerId);
        System.out.println("Farmer Name     : " + farmerName);
        System.out.println("Village         : " + village);
        System.out.println("Land Area       : " + landArea + " acres");

        System.out.println("==========================================");
    }

    public void generateCropReport() {

        reportTitle = "CROP CULTIVATION REPORT";

        System.out.println("\n==========================================");
        System.out.println("             " + reportTitle);
        System.out.println("==========================================");

        System.out.println("Crop ID         : " + cropId);
        System.out.println("Crop Name       : " + cropName);
        System.out.println("Crop Variety    : " + cropVariety);
        System.out.println("Crop Status     : " + cropStatus);

        System.out.println("==========================================");
    }

    public void generateHarvestReport() {

        reportTitle = "HARVEST PRODUCTION REPORT";

        System.out.println("\n==========================================");
        System.out.println("             " + reportTitle);
        System.out.println("==========================================");

        System.out.println("Harvest ID          : " + harvestId);
        System.out.println("Crop Name           : " + cropName);
        System.out.println("Harvested Quantity  : " + harvestedQuantity + " kg");
        System.out.println("Selling Price       : " + sellingPrice + " per kg");

        System.out.println("==========================================");
    }

    public void generateRevenueReport() {

        reportTitle = "REVENUE REPORT";

        totalRevenue = harvestedQuantity * sellingPrice;

        System.out.println("\n==========================================");
        System.out.println("             " + reportTitle);
        System.out.println("==========================================");

        System.out.println("Harvest ID          : " + harvestId);
        System.out.println("Crop Name           : " + cropName);
        System.out.println("Quantity Sold       : " + harvestedQuantity + " kg");
        System.out.println("Selling Price       : " + sellingPrice + " per kg");
        System.out.println("------------------------------------------");
        System.out.println("Total Revenue       : " + totalRevenue);
        System.out.println("==========================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ReportGenerationService report = new ReportGenerationService();

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println("     AGRISENSE - REPORT GENERATION SERVICE");
            System.out.println("==============================================");

            System.out.println("1. Generate Farmer Report");
            System.out.println("2. Generate Crop Report");
            System.out.println("3. Generate Harvest Report");
            System.out.println("4. Generate Revenue Report");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    report.generateFarmerReport();
                    break;

                case 2:
                    report.generateCropReport();
                    break;

                case 3:
                    report.generateHarvestReport();
                    break;

                case 4:
                    report.generateRevenueReport();
                    break;

                case 0:
                    System.out.println("\nExiting Report Generation Service...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

    }
}