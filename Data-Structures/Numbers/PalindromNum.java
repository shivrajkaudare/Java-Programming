package Other_Programs;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to check :");
		number = sc.nextInt();
		
		int ans = 0;
		int r;
		int temp = number;
		
		while(number > 0) {
			 r = number % 10;
			 ans = (ans * 10) + r;
			 number = number / 10;
			 
		}
		if(temp == ans) {
			System.out.println("Number is palindrom");
			
		}else {
			System.out.println("Number is not palindrom");
		}

	}

}
