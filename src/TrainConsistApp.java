import java.util.Arrays;

public class UC19BinarySearchBogieID {

    public static void main(String[] args) {

        // Step 1: Sorted bogie IDs (REQUIRED for binary search)
        String[] bogieIDs = {"B101", "B205", "B309", "B412", "B550"};

        // Step 2: Search key
        String searchKey = "B309";

        // Step 3: Binary search setup
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIDs[mid].compareTo(searchKey);

            if (result == 0) {
                System.out.println("Bogie found at index: " + mid);
                found = true;
                break;
            }
            else if (result < 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("Bogie ID NOT found ❌");
        } else {
            System.out.println("Binary search completed successfully ✅");
        }
    }
}