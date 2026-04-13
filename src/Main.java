import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Adding bogies (Create operation)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion (Read operation)
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Remove a bogie (Delete operation)
        bogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(bogies);

        // Check if a bogie exists (Search operation)
        boolean exists = bogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' bogie exist? " + exists);

        // Final state of the list
        System.out.println("\nFinal list of bogies:");
        System.out.println(bogies);
    }
}