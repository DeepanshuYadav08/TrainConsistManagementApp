import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie model
    public static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " | Capacity: " + capacity;
        }
    }

    // Filter method using Stream API
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===============================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        int threshold = 60;

        // Apply filtering
        List<Bogie> filteredBogies = filterBogiesByCapacity(bogies, threshold);

        // Display result
        System.out.println("Filtered Bogies (Capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);
    }
}