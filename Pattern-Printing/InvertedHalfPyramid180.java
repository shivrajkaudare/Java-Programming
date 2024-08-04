package Pattern_Printing;

// Output-        *
//              * *
//            * * *
//          * * * *
public class InvertedHalfPyramid180 {

	public static void main(String[] args) {
		
		  int n = 4;
          for(int i = 1;i <= n; i++) {
        	  
        	  // loop for spaces
        	  for(int j = 1; j <= n-i; j++) {
        		  System.out.print(" ");
        	  }
        		
           // loop for *
        	  for(int j = 1;j <= i; j++) {
        			  
        			  System.out.print("*");
        		  }
        	  System.out.println();
         }
        	 
   }
}
