package exercise;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		// Reverse a given number 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n = obj.nextInt();
		
		int remainder;
		int temp = n;
		int reverse = 0;
		
		
		while(temp!=0)
		{
			remainder = temp %10;
			reverse = (reverse*10)+remainder;
			temp = temp/10;
		}
		
		System.out.println(reverse);

	}

}
