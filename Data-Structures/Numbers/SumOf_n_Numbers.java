

import java.util.Scanner;

public class SumOf_n_Numbers {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the nth Element = ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			
			sum = sum + i;
		}
		System.out.println("Sum of n numbers is = "+ sum);
		
		double avg = sum / n;
		System.out.print("Avg of sum is = "+ avg);
		
	}

}
