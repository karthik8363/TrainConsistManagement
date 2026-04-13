import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Method to perform search with validation
    public static void searchBogie(List<String> bogies, String key) {

        // Defensive check (Fail-Fast)
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Search failed: No bogies available in the train.");
        }

        // Linear search logic (can reuse UC18)
        boolean found = false;

        for (int i = 0; i < bogies.size(); i++) {
            if (bogies.get(i).equals(key)) {
                System.out.println("Bogie ID found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found in the train.");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Empty train (no bogies)
        List<String> bogieList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            // Attempt search
            searchBogie(bogieList, key);

        } catch (IllegalStateException e) {
            // Handle fail-fast exception
            System.out.println("Error: " + e.getMessage());
        }

        // Program continues safely
        System.out.println("\nProgram continues execution...");

        scanner.close();
    }
}