import java.util.*;

public class UC16BubbleSortBogies {

    public static void main(String[] args) {

        // Step 1: Passenger bogie capacities
        int[] capacities = {72, 54, 24, 90, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // Step 2: Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 3: Output sorted array
        System.out.println("After Sorting (Bubble Sort):");
        System.out.println(Arrays.toString(capacities));
    }
}