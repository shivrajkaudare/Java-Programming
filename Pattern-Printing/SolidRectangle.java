package Pattern_Printing;

// solid rectangle :

//output =>  * * * * *
//           * * * * *
//           * * * * *
//           * * * * *


import java.util.*;
public class SolidRectangle {

	public static void main(String[] args) {
		//rows
       for(int i = 1; i <= 4; i ++) {
    	   
    	   for(int j = 0; j <= 5; j ++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}

}
