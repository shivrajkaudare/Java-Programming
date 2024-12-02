// Output -
// Original Array:
//    1 2 3 4 5 
// Reversed Array:
//    5 4 3 2 1


public class ReverseArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array in-place
        int start = 0;                // Starting index
        int end = arr.length - 1;     // Ending index

        // Swap elements from start to end until reaching the middle
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
