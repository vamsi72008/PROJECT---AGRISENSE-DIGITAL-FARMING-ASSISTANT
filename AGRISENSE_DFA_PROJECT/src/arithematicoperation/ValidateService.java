package arithematicoperation;
import java.util.Scanner;

public class ValidateService {

    private int farmerId;
    private int cropId;
    private long mobileNumber;
    private String email;

    public boolean validateFarmerId(int farmerId) {

        this.farmerId = farmerId;

        if (farmerId > 0) {
            System.out.println("Farmer ID is valid.");
            return true;
        } else {
            System.out.println("Farmer ID is invalid.");
            return false;
        }
    }

    public boolean validateCropId(int cropId) {

        this.cropId = cropId;

        if (cropId > 0) {
            System.out.println("Crop ID is valid.");
            return true;
        } else {
            System.out.println("Crop ID is invalid.");
            return false;
        }
    }

    public boolean validateMobileNumber(long mobileNumber) {

        this.mobileNumber = mobileNumber;

        String mobile = String.valueOf(mobileNumber);

        if (mobile.length() == 10 && mobile.charAt(0) >= '6'
                && mobile.charAt(0) <= '9') {

            System.out.println("Mobile number is valid.");
            return true;

        } else {

            System.out.println("Mobile number is invalid.");
            return false;
        }
    }

    public boolean validateEmail(String email) {

        this.email = email;

        if (email != null
                && email.contains("@")
                && email.contains(".")
                && email.indexOf("@") < email.lastIndexOf(".")) {

            System.out.println("Email address is valid.");
            return true;

        } else {

            System.out.println("Email address is invalid.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ValidateService validate = new ValidateService();

        int choice;

        do {

            System.out.println("\n===== AGRISENSE - VALIDATE SERVICE MODULE =====");

            System.out.println("1. Validate Farmer ID");
            System.out.println("2. Validate Crop ID");
            System.out.println("3. Validate Mobile Number");
            System.out.println("4. Validate Email");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Farmer ID: ");
                    int farmerId = sc.nextInt();

                    validate.validateFarmerId(farmerId);

                    break;

                case 2:

                    System.out.print("Enter Crop ID: ");
                    int cropId = sc.nextInt();

                    validate.validateCropId(cropId);

                    break;

                case 3:

                    System.out.print("Enter Mobile Number: ");
                    long mobileNumber = sc.nextLong();

                    validate.validateMobileNumber(mobileNumber);

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    validate.validateEmail(email);

                    break;

                case 0:

                    System.out.println("\nExiting Validate Service Module...");

                    break;

                default:

                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}