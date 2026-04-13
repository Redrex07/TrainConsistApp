import java.util.*;
import java.util.stream.Collectors;

public class UC9GroupBogies {

    // Inner Bogie class
    static class Bogie {
        private String name;
        private int capacity;
        private String type; // NEW: type for grouping

        public Bogie(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 54, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo Box", 100, "Goods"));
        bogies.add(new Bogie("Oil Tanker", 80, "Goods"));

        // Step 2: Group using stream
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies:");
        for (String type : groupedBogies.keySet()) {
            System.out.println("\nType: " + type);
            for (Bogie b : groupedBogies.get(type)) {
                System.out.println(b);
            }
        }
    }
}