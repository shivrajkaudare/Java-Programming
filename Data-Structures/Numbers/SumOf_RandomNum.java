

import java.util.Scanner;

public class SumOf_RandomNum {

	public static void main(String[] args) {
		
		// Sum of an Random Numbers.
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n;
		System.out.println("How many Elements sum and Avg you want to count : ");
		n = sc.nextInt();
		
		System.out.println("Enter elements");
		 for(int i = 0; i < n; i++) {
			 int num = sc.nextInt();
			  sum = sum + num;
		 }
		 System.out.println("Sum of Numbers you have entered = "+sum);
		 
	     double avg = sum / n;
	     System.out.print("Average of numbers you have entered = "+ avg);
	     
	     sc.close();
	     
	     	
	}

}

