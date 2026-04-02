import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ==========================================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * ==========================================================
 * * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class TrainConsistManagementApp{

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==============================================\n");

        // 1. Create a LinkedHashSet to represent the train formation
        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // 2. Attach bogies in order
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 3. Attempt to attach a duplicate bogie intentionally
        // The LinkedHashSet will ignore this duplicate automatically
        formation.add("Sleeper");

        // 4. Display the final train formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);
        
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        
        System.out.println("\nUC5 formation setup completed...");
    }
}
