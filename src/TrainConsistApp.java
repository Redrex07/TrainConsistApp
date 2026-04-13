import java.util.*;
import java.util.stream.Collectors;

public class UC13PerformanceComparison {

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
    }

    public static void main(String[] args) {

        // Step 1: Create test data
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        // =========================
        // LOOP-BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        // =========================
        // STREAM-BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();

        // =========================
        // RESULTS
        // =========================
        System.out.println("Loop Time   : " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time : " + (endStream - startStream) + " ns");
    }
}