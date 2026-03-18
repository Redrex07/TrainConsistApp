import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        // UC2 (existing)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("General");

        // UC3 — Remove a bogie
        trainConsist.remove("General");

        // Display updated train
        System.out.println("Updated Train Bogies: " + trainConsist);

        // Count
        System.out.println("Total Bogies: " + trainConsist.size());
    }
}