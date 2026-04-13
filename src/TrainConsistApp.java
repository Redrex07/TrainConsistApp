import java.util.Arrays;

public class UC17SortBogieNames {

    public static void main(String[] args) {

        // Step 1: Bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Cargo"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Built-in sort
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("After Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}