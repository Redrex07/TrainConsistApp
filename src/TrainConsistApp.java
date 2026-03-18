import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC5 — LinkedHashSet (order + uniqueness)
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // ADD bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // ADD duplicate
        train.add("Sleeper"); // will be ignored

        // DISPLAY final formation
        System.out.println("Train Formation: " + train);
    }
}