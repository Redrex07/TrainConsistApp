import java.util.*;

public class UC7SortBogies {

    // Bogie class (inner class so everything is in one file)
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

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator (lambda)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display result
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}