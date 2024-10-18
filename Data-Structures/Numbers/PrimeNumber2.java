// program- print the prime numbers in given range.

import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number");
       int n = sc.nextInt();
       
      if(n <= 1){
          System.out.println("Enter a number greater than 1");
      }else{
           System.out.print("The Prime numbers till given Numbers are : ");

          for(int i = 2; i <=n; i++){
              boolean isPrime = true;
              for(int j = 2; j <= i/2; j++){
                  
                  if(i % j == 0){
                      isPrime = false;
                      break;
                  }
              }
              if(isPrime){
                  System.out.print(i+",");
              }
          }     
      }  
    }
}