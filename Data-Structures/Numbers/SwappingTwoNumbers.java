package Other_Programs;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		// Swapping two numbers using 3rd variable
		
	/*  Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter first Number a = ");
         int a = sc.nextInt();
         
         System.out.print("Enter Second Number b = ");  
         int b = sc.nextInt();
         
         int temp = 0;
         System.out.println("Before Swapping a = "+ a +" b ="+ b);
         
         temp = a;
         a = b;
         b = temp;
         System.out.println("After Swapping a = "+ a + " b = "+ b); */
		
/***************************************************************************************/
		
		// Swapping without using 3rd variable
		
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter first Number a = ");
        int a = sc.nextInt();
        
        System.out.print("Enter Second Number b = ");  
        int b = sc.nextInt();
        
        System.out.println("Before Swapping a = "+ a +" b ="+ b);
        
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("After swapping a = "+ a + " b = "+ b);
         
		
	}

}
