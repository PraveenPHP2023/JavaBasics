package interview_ques;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Reverse the given number
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = in.nextInt();
		
		int reverse =0 ; 
		int rem;
		
		while (n!=0) // 123!=0 12!=0 1!=0 
		{
			rem = n%10;  // 3 2 1
			reverse = (reverse*10)+rem; //(0*10)+3=3  (3*10)+2=32  (32*10)+1=321
			n = n/10; // 12  1  0
		}
		System.out.println(reverse);
		

	}

}
