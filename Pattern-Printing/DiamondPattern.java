// Output -    *
//            ***
//           *****
//          *******
//         *********
//        ***********
//       *************
//       *************
//        ***********
//         *********
//          *******
//           *****
//            ***
//             *
       

public class DiamondPattern {

	public static void main(String[] args) {
		int n = 7;
		
		
		for(int i = 1; i <= n; i++) {
			// upper Half
			// for loop for spaces
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// for loop for *
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	     // lower half
		// 
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// for loop for *
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}

