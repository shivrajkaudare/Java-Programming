
package Arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
	
		int arr[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		int i , j;
		
		System.out.println("Enter Array Elements :");

		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Array you have Entered is :");
        for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				System.out.print(arr[i][j]);
			}
			System.err.println();
		}
	}

}
