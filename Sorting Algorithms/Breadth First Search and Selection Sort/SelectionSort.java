import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));

        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Time taken in nanoseconds: " + timeElapsed);
    }
}

