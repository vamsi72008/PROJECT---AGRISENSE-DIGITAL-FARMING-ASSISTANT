package arithematicoperation;

import java.util.Scanner;

public class Main {

    private Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {

        System.out.println("\n==============================================");
        System.out.println("        AGRISENSE - DIGITAL FARMING");
        System.out.println("==============================================");

        System.out.println("1. Farmer Management");
        System.out.println("2. Crop Management");
        System.out.println("3. Farm Management");
        System.out.println("4. Irrigation & Resource Management");
        System.out.println("5. Harvest & Sales");
        System.out.println("6. Validate Service");
        System.out.println("7. Search Service");
        System.out.println("8. Report Generation");
        System.out.println("9. Analysis Service");
        System.out.println("0. Exit");

        System.out.println("==============================================");
        System.out.print("Enter your choice: ");
    }

    public void processChoice(int choice) {

        switch (choice) {

            case 1:
                Farmer.main(new String[0]);
                break;

            case 2:
                Crop.main(new String[0]);
                break;

            case 3:
                Farm.main(new String[0]);
                break;

            case 4:
                IrrigationManagement.main(new String[0]);
                break;

            case 5:
                HarvestSales.main(new String[0]);
                break;

            case 6:
                ValidateService.main(new String[0]);
                break;

            case 7:
                SearchService.main(new String[0]);
                break;

            case 8:
                ReportGenerationService.main(new String[0]);
                break;

            case 9:
                AnalysisService.main(new String[0]);
                break;

            case 0:
                exitApplication();
                break;

            default:
                System.out.println("\nInvalid choice. Please try again.");
        }
    }

    public void exitApplication() {

        System.out.println("\n==============================================");
        System.out.println("     Thank you for using AgriSense!");
        System.out.println("     Digital Farming Assistant");
        System.out.println("==============================================");

        scanner.close();
    }

    public static void main(String[] args) {

        Main main = new Main();

        int choice;

        do {

            main.displayMenu();

            choice = main.scanner.nextInt();

            main.processChoice(choice);

        } while (choice != 0);
    }
}
