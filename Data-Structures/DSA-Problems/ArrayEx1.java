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
