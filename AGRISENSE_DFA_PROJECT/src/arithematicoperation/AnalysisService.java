package arithematicoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AnalysisService {

    private List<String> farmerList;
    private List<String> cropList;
    private List<Double> harvestList;
    private Map<String, Double> cropYieldMap;

    public AnalysisService() {

        farmerList = new ArrayList<>();
        cropList = new ArrayList<>();
        harvestList = new ArrayList<>();
        cropYieldMap = new HashMap<>();

        farmerList.add("Ramesh");
        farmerList.add("Suresh");
        farmerList.add("Vamsi");

        cropList.add("Rice");
        cropList.add("Wheat");
        cropList.add("Cotton");

        harvestList.add(2500.0);
        harvestList.add(1800.0);
        harvestList.add(3200.0);

        cropYieldMap.put("Rice", 2500.0);
        cropYieldMap.put("Wheat", 1800.0);
        cropYieldMap.put("Cotton", 3200.0);
    }

    public void identifyHighestYieldCrop() {

        System.out.println("\n===== Highest Yield Crop =====");

        Map.Entry<String, Double> highest =
                cropYieldMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (highest != null) {

            System.out.println("Crop Name   : " + highest.getKey());
            System.out.println("Yield       : " + highest.getValue() + " kg");

        } else {

            System.out.println("No crop records available.");
        }
    }

    public void calculateTotalRevenue() {

        System.out.println("\n===== Total Revenue Analysis =====");

        double totalRevenue = harvestList
                .stream()
                .mapToDouble(quantity -> quantity * 40)
                .sum();

        System.out.println("Total Harvest Quantity : "
                + harvestList.stream()
                .mapToDouble(Double::doubleValue)
                .sum() + " kg");

        System.out.println("Selling Price per kg   : 40");
        System.out.println("Total Revenue          : " + totalRevenue);
    }

    public void analyzeWaterConsumption() {

        System.out.println("\n===== Water Consumption Analysis =====");

        double totalWater = 8500.0;

        double averageWater = totalWater / farmerList.size();

        System.out.println("Total Water Consumption   : "
                + totalWater + " litres");

        System.out.println("Number of Farmers         : "
                + farmerList.size());

        System.out.println("Average Water Consumption : "
                + averageWater + " litres per farmer");

        if (averageWater <= 2000) {

            System.out.println("Water Consumption Level   : Low");

        } else if (averageWater <= 4000) {

            System.out.println("Water Consumption Level   : Moderate");

        } else {

            System.out.println("Water Consumption Level   : High");
        }
    }

    public void generateSummary() {

        System.out.println("\n==============================================");
        System.out.println("          AGRISENSE ANALYSIS SUMMARY");
        System.out.println("==============================================");

        System.out.println("Total Farmers       : " + farmerList.size());
        System.out.println("Total Crops         : " + cropList.size());

        double totalYield = cropYieldMap
                .values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total Crop Yield    : " + totalYield + " kg");

        double totalRevenue = harvestList
                .stream()
                .mapToDouble(quantity -> quantity * 40)
                .sum();

        System.out.println("Total Revenue       : " + totalRevenue);

        System.out.println("==============================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AnalysisService analysis = new AnalysisService();

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println("       AGRISENSE - ANALYSIS SERVICE");
            System.out.println("==============================================");

            System.out.println("1. Identify Highest Yield Crop");
            System.out.println("2. Calculate Total Revenue");
            System.out.println("3. Analyze Water Consumption");
            System.out.println("4. Generate Summary");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    analysis.identifyHighestYieldCrop();
                    break;

                case 2:
                    analysis.calculateTotalRevenue();
                    break;

                case 3:
                    analysis.analyzeWaterConsumption();
                    break;

                case 4:
                    analysis.generateSummary();
                    break;

                case 0:
                    System.out.println("\nExiting Analysis Service...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

       
    }
}
