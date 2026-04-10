import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    // Validation methods (IMPORTANT for test cases)
    public static boolean isValidTrainId(String trainId) {
        // Format: TRN-1234
        return Pattern.matches("TRN-\\d{4}", trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        // Format: PET-AB
        return Pattern.matches("[A-Z]{3}-[A-Z]{2}", cargoCode);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("===========================================\n");

        // Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validation
        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);

        // Output
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}
//TrainConsistManagementApp