package interview_ques;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// To find the given number is perfect number or not 
		
		/*
		 for example n = 6
		 6%1=0
		 6%2=0
		 6%3=0
		 6%4=2
		 6%5=1
		 
		 now add the 0 divisior number 1+2+3 =6 
		 
		 add number = n => Perfect number
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = in.nextInt();
		
		int sum =0;
		
		for(int i =1;i<n;i++)
		{
			if(n%i==0)
			{
				sum +=i;
			}
		}
		
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
	}

}
