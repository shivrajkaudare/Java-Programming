package Other_Programs;

import java.util.*;
public class Armstrong_Num {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Armstrong Number");
		number = sc.nextInt();
		
		int r;
		int ans=0;
		int temp = number;
		
		while(number > 0) {
			
			r = number % 10;
			ans = r * r * r + ans;
			number = number / 10;
		}
		if (temp == ans) {
			System.out.println("Number is Armstrong");	
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
