package Pattern_Printing;

// OutPut -  *
//          * *
//         * * *
//        * * * *
//       * * * * *
public class Pyramid {

	public static void main(String[] args) {
		
		int n = 5;
		 for(int i = 1; i <= n; i++){
			 
			 // for printing extra spaces
			 for(int j = 1; j <= n-i; j++) {
				  System.out.print(" ");
			 }
			 // for printing *
			 for(int j = 1; j <= i; j++) {
				 System.out.print("*"+" ");
			 }
			 System.out.println();
			 
			 
		 }
		

	}

}

