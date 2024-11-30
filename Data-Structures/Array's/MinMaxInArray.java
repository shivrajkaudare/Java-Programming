// Output -\
// Smallest Element: -3
// Largest Element: 10

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, -3, 7, 10};
        
        // Call the method and store results
        int[] result = findMinMax(arr);

        // Print the smallest and largest elements
        System.out.println("Smallest Element: " + result[0]);
        System.out.println("Largest Element: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        // Initialize variables to store min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {
            if (num < min) {
                min = num; // Update min if a smaller value is found
            }
            if (num > max) {
                max = num; // Update max if a larger value is found
            }
        }

        return new int[]{min, max}; // Return both min and max as an array
    }
}
