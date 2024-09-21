// output -  * * * * *
//          * * * * *
//         * * * * *
//        * * * * *
//       * * * * *
public class SolidRhohmbus {

	public static void main(String[] args) {
		int n = 5;
		
		// for loop that defines rows.
		for(int i = 1; i <= n; i++) {
			
			// for loop for spaces.
			  for(int j = 1; j <= n-i; j++) {
				  System.out.print(" ");
			  }
			  
			// for loop for printing *(columns).
			  for(int j = 1; j <= n; j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		}
		 
	}

}
