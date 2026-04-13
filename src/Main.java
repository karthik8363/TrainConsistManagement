import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs (ensures uniqueness)
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display the set (duplicates automatically removed)
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}