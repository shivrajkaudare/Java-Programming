package Pattern_Printing;

// output - * * * *
//            * * *
//              * *
//                *

public class RightHalfInvertedPyramid {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 4;
		
		for(int i = n; i >= 1; i--) {
			
			// for loop for spaces _.
			for(int j = 1; j <= n-i; j++) {
				
				System.out.print(" ");
				
			}
			
			// for loop for "*".
			for(int j = 1; j <= i; j++) {
				 System.out.print("*");
			}
			System.out.println();
		}

	}

}

    

