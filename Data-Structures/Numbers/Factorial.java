package Other_Programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		
		int fact = 1;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		for(int i = 1; i <=num; i++) {
			fact *= i;
		}
		System.out.println("factorial of nuber is "+ fact);
		
	}

}
