import java.util.*;

// Fibonnaci series is sequence of numbers in which evry third number equals to the sum of preceding two numbers.
// fibonnaci series first two numbers are 0 and 1.
// fibonnaci seris look like = 0, 1, 1, 2, 5, 8, 13, 21, 34,......

public class FibonacciSeries {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the n number");
       int n = sc.nextInt();
       
       int num1 = 0; 
       int num2 = 1;
       System.out.print("Fibonacci Series :"+num1+","+num2);
       for(int i = 2; i < n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
             System.out.print(","+num3);
           
       }
    }
}
    

