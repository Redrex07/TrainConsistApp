import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC4 — LinkedList for ordered bogies
        LinkedList<String> train = new LinkedList<>();

        // ADD bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // INSERT Pantry at position 2
        train.add(2, "Pantry");

        System.out.println("After Adding Pantry: " + train);

        // REMOVE first and last
        train.removeFirst();
        train.removeLast();

        // FINAL OUTPUT
        System.out.println("Final Train Consist: " + train);
    }
}