// program - check whether the give number is prime or not.

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is greater than 1
        if (n <= 1) {
            System.out.println("Enter a number greater than 1");
        } else {
            boolean prime = true;
            
            // Loop to check for divisors up to the square root of n
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;  // Exit the loop if a divisor is found
                }
            }
            
            // Output the result based on whether prime is true or false
            if (prime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}
