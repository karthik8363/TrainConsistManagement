import java.util.ArrayList;
import java.util.List;

// GoodsBogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " → Cargo: " + cargo;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // valid
        bogies.add(new GoodsBogie("Box", "Grain"));             // valid
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));   // ❌ Uncomment to test failure

        // Display bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // Safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE for operation");
        }
    }
}