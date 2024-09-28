// print the prime number till n th element .
import java.util.Scanner;
public class PrimeNumber1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter n th element : ");
      int n = sc.nextInt();
      
      boolean prime = true;
       
      for(int i = 2; i < Math.sqrt(n); i++){
          if(n % i ==0) {
            prime = false;
            break;
          }   
      }
      if(prime == true){
         System.out.println(n+"is Prime ");
      }
    }
    
}
