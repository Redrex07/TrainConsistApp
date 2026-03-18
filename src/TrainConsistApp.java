import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC3 — HashSet for Unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ADD bogie IDs (including duplicates)
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2"); // duplicate
        bogieIds.add("B1"); // duplicate

        // DISPLAY unique bogies
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}