import java.util.*;

public class UC10TotalSeats {

    // Inner Bogie class
    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Step 2: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}