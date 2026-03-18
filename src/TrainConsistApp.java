import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        // UC2 — Add Bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("General");

        // Display Bogies
        System.out.println("Train Bogies: " + trainConsist);

        // Count
        System.out.println("Total Bogies: " + trainConsist.size());
    }
}