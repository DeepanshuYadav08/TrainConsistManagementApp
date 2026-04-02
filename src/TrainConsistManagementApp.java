import java.util.HashMap;
import java.util.Map;

/**
 * ==========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * ==========================================================
 * * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * @author Developer
 * @version 6.0
 */
public class TrainConsistManagementApp{

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        // 1. Create a HashMap for bogie-capacity mapping
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 2. Insert bogie capacities using the put() method
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);

        // 3. Iterate through the map entries using entrySet()
        // This allows us to access both the Key and Value simultaneously
        System.out.println("Bogie and Capacity Information:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() +
                    " | Capacity: " + entry.getValue() + " seats");
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}