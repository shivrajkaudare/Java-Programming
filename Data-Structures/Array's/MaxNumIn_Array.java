// Maximum Number from given array.

package Arrays;

public class MaxNumInArray {

	public static void main(String[] args) {
		
     int arr [] = {1,2,4,56,76};
     int max = 0;
     
     for (int i = 0; i < arr.length; i++) {
    	 if(arr[i] > max) {
    		  max = arr[i];
    	 }
     }
     System.out.println(max);
	}

}
