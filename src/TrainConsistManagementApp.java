import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * ==========================================================
 * * Use Case 7: Sort Bogies by Capacity (Comparator)
 * * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator and Lambda expressions.
 * * @author Developer
 * @version 7.0
 */
public class TrainConsistManagementApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // 1. Create a list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 2. Display unsorted data
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        System.out.println();

        // 3. Sort using Comparator logic (comparing by capacity)
        // We use the functional approach: Comparator.comparingInt()
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 4. Display sorted result
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}