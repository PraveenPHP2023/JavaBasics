package interview_ques;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// write a program to find the factor of the given number
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
