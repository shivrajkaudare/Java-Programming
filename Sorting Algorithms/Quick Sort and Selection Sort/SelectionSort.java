import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        // Measure the time taken for sorting
        long startTime = System.nanoTime();
        selectionSort(numbers);
        long endTime = System.nanoTime();

        // Print the sorted array and the time taken
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
    }
}

