package Arrays;
import java.util.*;
import java.lang.reflect.Array;

public class OneDArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
        System.out.println("The Array is : ");
        
        for(int i = 0; i < arr.length; i++) {
        	
	        System.out.println(arr[i]);
        }
	}

}
