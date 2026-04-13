import java.util.*;

public class UC12SafetyCompliance {

    // Inner class
    static class Bogie {
        private String type;
        private String cargo;

        public Bogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return type + " - " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create goods bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Food"));
        bogies.add(new Bogie("Flat", "Machinery"));

        // Step 2: Safety rule using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !(b.getType().equals("Cylindrical") &&
                                !b.getCargo().equals("Petroleum"))
                );

        // Step 3: Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}