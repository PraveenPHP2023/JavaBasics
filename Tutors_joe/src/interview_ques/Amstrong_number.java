package interview_ques;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		// To find the given number is Armstrong or not
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = in.nextInt();
		
		int remainder;
		int result =0;
		int temp ;
		
		temp = n;
		
		while(temp!=0)
		{
			remainder = temp%10;
			result += Math.pow(remainder, 4);
			temp = temp/10;
		}
		
		if(result==n)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not an Amstrong number");
		}
		

	}

}
