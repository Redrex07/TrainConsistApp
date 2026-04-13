import java.util.*;

public class UC20SearchExceptionHandling {

    public static void main(String[] args) {

        // Step 1: Bogie list (you can make it empty to test exception)
        List<String> bogies = new ArrayList<>();
        bogies.add("B101");
        bogies.add("B205");
        bogies.add("B309");

        // Search key
        String searchKey = "B309";

        try {

            // Step 2: Validate state BEFORE searching
            if (bogies.isEmpty()) {
                throw new IllegalStateException("No bogies available in the train!");
            }

            // Step 3: Linear search logic
            boolean found = false;

            for (String bogie : bogies) {
                if (bogie.equals(searchKey)) {
                    System.out.println("Bogie found: " + bogie);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie NOT found ❌");
            } else {
                System.out.println("Search completed successfully ✅");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception caught ❌: " + e.getMessage());
        }

        System.out.println("Program continues safely 🚆");
    }
}