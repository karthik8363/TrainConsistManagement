import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " → Capacity: " + capacity;
    }
}

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display bogies
        System.out.println("\nTrain Bogies:");
        bogies.forEach(System.out::println);

        // Stream pipeline: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        bogies.forEach(System.out::println);
    }
}}