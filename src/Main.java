// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;   // Cylindrical, Rectangular
    String cargo;   // Petroleum, Coal, etc.

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // Business rule validation
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + shape + " → " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public String toString() {
        return shape + " → Cargo: " + (cargo != null ? cargo : "Not Assigned");
    }
}

// Main Application
public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another safe assignment
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);
    }
}