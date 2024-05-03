import java.util.Arrays;

public class QuickSortTime {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {64, 25, 12, 22, 11};

        // Measure the time taken for sorting
        long startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();

        // Print the sorted array and the time taken
        System.out.println("Sorted array: " + Arrays.toString(arr));
        long duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

