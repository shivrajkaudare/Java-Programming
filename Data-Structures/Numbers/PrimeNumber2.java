// program- print the prime numbers in given range.

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String  args[]) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a last element ");
		  int n = sc.nextInt();
		  
		 
		  for(int i = 2; i <= n; i++) {
			  boolean isPrime = true;
			  
		     for(int j = 2; j < i/2; j++) {
			  
			  if( i % j == 0) {
				  isPrime = false; 
				   break;
			  }  
		  }
		  if(isPrime) {
			  System.out.println(i);
			  
		  }
		  }
	}

}

