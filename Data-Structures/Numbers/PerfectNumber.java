// A perfect number is a number that is equal to the sum of its proper divisors.
//	Example: 6 = 1 + 2 + 3.

import java.util.Scanner;

public class PerfectNumber {
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int n) {
        int sum = 0;

        // Find all divisors of n up to n/2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors equals the number
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and display result
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }

        scanner.close();
    }
}
