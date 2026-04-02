import java.util.LinkedList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * ==========================================================
 * * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==============================================\n");

        // 1. Create a LinkedList to maintain insertion order
        // LinkedList is ideal here as it models real-world chaining (Nodes)
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies in sequence: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);
        System.out.println();

        // 3. Insert a 'Pantry Car' at position 2
        // In a LinkedList, this involves updating node references
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);
        System.out.println();

        // 4. Remove the first and last bogie
        // Uses specific LinkedList methods removeFirst() and removeLast()
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist);
        System.out.println();

        System.out.println("UC4 ordered consist operations completed...");
    }
}