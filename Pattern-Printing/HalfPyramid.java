package Pattern_Printing;

// Half Pyramid -
// output => *
//           * *
//           * * *
//           * * * *

public class HalfPyramid {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++ ) {
			
			for(int j = 1; j <= i; j++) {
					
			  	System.out.print("*");	
				
			}
			System.out.println();
		}
		
	}

}


