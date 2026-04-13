// Custom Exception Class
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return type + " → Capacity: " + capacity;
    }
}

// Main Application
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated: " + b1);

            // Invalid bogie (negative capacity)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2); // won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        try {
            // Invalid bogie (zero capacity)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            System.out.println("Created: " + b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Valid multiple bogies
        try {
            PassengerBogie b4 = new PassengerBogie("General", 90);
            PassengerBogie b5 = new PassengerBogie("AC Chair", 56);

            System.out.println("\nAdditional Valid Bogies:");
            System.out.println(b4);
            System.out.println(b5);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}