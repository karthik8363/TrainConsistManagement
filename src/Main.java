import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies (in order)
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(consist);

        // Remove first bogie
        consist.removeFirst();

        // Remove last bogie
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);

        // Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(consist);
    }
} }