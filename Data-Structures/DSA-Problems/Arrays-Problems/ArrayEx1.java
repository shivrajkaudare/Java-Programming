/*
  Problem Statement –
      A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. 
      The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

      Example 1 :
         N=8 and arr = [4,5,0,1,9,0,5,0].
         There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
      
     Input : 8 – Value of N
    
     [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

     Output: 4 5 1 9 5 0 0 0
 */

 import java.util.Scanner;
 public class ArrayEx1 {
         public static void main(String[] args) {
             // Size of an array (N)
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter The Size of an Array - N");
             int N = sc.nextInt();
             
             //Array elements.
             int arr[] = new int[N];
             System.out.println("Enter the Array Element");
 
             for(int i=0; i<=N; i++){
                 arr[i] = sc.nextInt();
             }
            
             // Process to place Zeros at the end
             int index = 0; // index to place non-zero elements
 
             for(int i=0; i<=N; i++){
                if(arr[i] != 0){ 
                     arr[index++] = arr[i];
                }
             }
 
             // placing non zero elements at the end.
 
             while(index < N){
                 arr[index++] = 0;
             }
            
             // Final Array
 
             for(int i = 0; i <= N; i++){
                 System.out.println(arr[i]+" ");
             }
 
 
 
 
 
         
     }
 }
 
