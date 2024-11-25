// heck if a number is a power of two.
// Example: 8 → 2^3.

import java.util.Scanner;

public class PowerOfTwo {
    // Method to check if a number is a power of two
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }
        // A number is a power of two if only one bit is set in its binary representation
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and display result
        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a Power of Two.");
        } else {
            System.out.println(number + " is NOT a Power of Two.");
        }

        scanner.close();
    }
}

