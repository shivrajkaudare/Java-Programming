package Pattern_Printing;

// Output - *        *
//          **      **
//          ***    ***
//          **********
//          **********
//          ***    ***
//          **      **
//          *        *

public class ButterflyPattern {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 8;
		
		// 1st half part.
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			// for loop for the spaces.
			for(int j = 1; j <= 2*(n-i); j++) {
				
				System.out.print(" ");
				
			}
				
            for(int j = 1; j <= i ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// 2nd half part.
		
		for(int i = n; i >= 1; i--){
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// for loop for the spaces.
			for(int j = 1; j <= 2*(n-i); j++) {
				
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
