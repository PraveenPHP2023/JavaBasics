package interview_ques;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// write a program to find the given number is prime number or not
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = in.nextInt();
		
		int f =0; // dummy variable to count the divisible terms or count the zeros
		
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		
		if(f==2)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
