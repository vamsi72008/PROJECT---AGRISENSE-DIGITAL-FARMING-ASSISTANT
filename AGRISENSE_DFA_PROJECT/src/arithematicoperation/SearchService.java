package arithematicoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchService {

    private List<String> farmerList;
    private List<String> cropList;
    private List<String> farmList;
    private List<String> harvestList;

    public SearchService() {

        farmerList = new ArrayList<>();
        cropList = new ArrayList<>();
        farmList = new ArrayList<>();
        harvestList = new ArrayList<>();

        farmerList.add("101 - Ramesh");
        farmerList.add("102 - Suresh");
        farmerList.add("103 - Vamsi");

        cropList.add("201 - Rice");
        cropList.add("202 - Wheat");
        cropList.add("203 - Cotton");

        farmList.add("301 - Nellore Farm");
        farmList.add("302 - Guntur Farm");
        farmList.add("303 - Vijayawada Farm");

        harvestList.add("401 - Rice Harvest");
        harvestList.add("402 - Wheat Harvest");
        harvestList.add("403 - Cotton Harvest");
    }

    public void searchFarmer(Scanner sc) {

        System.out.println("\n===== Search Farmer =====");

        System.out.print("Enter Farmer ID or Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String farmer : farmerList) {

            if (farmer.toLowerCase().contains(search.toLowerCase())) {

                System.out.println("Farmer Found: " + farmer);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Farmer not found.");
        }
    }

    public void searchCrop(Scanner sc) {

        System.out.println("\n===== Search Crop =====");

        System.out.print("Enter Crop ID or Crop Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String crop : cropList) {

            if (crop.toLowerCase().contains(search.toLowerCase())) {

                System.out.println("Crop Found: " + crop);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Crop not found.");
        }
    }

    public void searchFarm(Scanner sc) {

        System.out.println("\n===== Search Farm =====");

        System.out.print("Enter Farm ID or Farm Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String farm : farmList) {

            if (farm.toLowerCase().contains(search.toLowerCase())) {

                System.out.println("Farm Found: " + farm);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Farm not found.");
        }
    }

    public void searchHarvest(Scanner sc) {

        System.out.println("\n===== Search Harvest =====");

        System.out.print("Enter Harvest ID or Harvest Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String harvest : harvestList) {

            if (harvest.toLowerCase().contains(search.toLowerCase())) {

                System.out.println("Harvest Found: " + harvest);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Harvest record not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SearchService search = new SearchService();

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println("     AGRISENSE - SEARCH SERVICE MODULE");
            System.out.println("==============================================");

            System.out.println("1. Search Farmer");
            System.out.println("2. Search Crop");
            System.out.println("3. Search Farm");
            System.out.println("4. Search Harvest");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    search.searchFarmer(sc);
                    break;

                case 2:
                    search.searchCrop(sc);
                    break;

                case 3:
                    search.searchFarm(sc);
                    break;

                case 4:
                    search.searchHarvest(sc);
                    break;

                case 0:
                    System.out.println("\nExiting Search Service Module...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);

    }
}
