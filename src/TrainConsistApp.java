public class UC14InvalidCapacity {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Bogie class with validation
    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + name + ": " + capacity
                );
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            Bogie b2 = new Bogie("AC Chair", -10); // invalid
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught ❌: " + e.getMessage());
        }

        System.out.println("Program continues safely ✅");
    }
}