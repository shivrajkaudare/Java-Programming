package Pattern_Printing;

// Output -       1
//               2 2
//              3 3 3
//             4 4 4 4
//            5 5 5 5 5
public class NumberPyramid {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			// spaces
			for(int j = 1; j <= n-i; j++) {
				
				System.out.print(" ");	
			}
			// number - prints number row number times.
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
				
			}
			System.out.println();
			
		}
		 
	}

}
