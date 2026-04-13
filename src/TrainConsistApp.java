public class UC18LinearSearchBogieID {

    public static void main(String[] args) {

        // Step 1: Bogie IDs (unsorted)
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        // Step 2: Search key
        String searchKey = "B309";

        // Step 3: Linear search
        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {

            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie found at index: " + i);
                found = true;
                break; // early termination
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("Bogie ID NOT found ❌");
        } else {
            System.out.println("Search completed successfully ✅");
        }
    }
}