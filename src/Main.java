import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {

            // Compare using equals()
            if (bogieIDs[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie ID found at position: " + i);
                break; // Early termination
            }
        }

        // Result if not found
        if (!found) {
            System.out.println("Bogie ID not found in the train.");
        }

        scanner.close();
    }
}