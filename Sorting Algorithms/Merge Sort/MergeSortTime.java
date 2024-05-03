import java.util.Arrays;

public class MergeSortTime {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Measure the time taken for sorting
        long startTime = System.nanoTime();
        mergeSort(arr);
        long endTime = System.nanoTime();

        // Print the sorted array and the time taken
        System.out.println("Sorted array: " + Arrays.toString(arr));
        long duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

