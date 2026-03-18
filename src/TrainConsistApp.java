import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2 — ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // DISPLAY after insertion
        System.out.println("After Adding Bogies: " + passengerBogies);

        // REMOVE one bogie
        passengerBogies.remove("AC Chair");

        // DISPLAY after removal
        System.out.println("After Removing AC Chair: " + passengerBogies);

        // CHECK existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present");
        } else {
            System.out.println("Sleeper bogie is NOT present");
        }

        // FINAL STATE
        System.out.println("Final Bogie List: " + passengerBogies);
    }
}