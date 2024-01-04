package interview_ques;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 1*2*3*4*5 = 120
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		int fact =1;
		
		for (int i=1;i<=n;i++)
		{
			fact *=i;
		}
		
		System.out.println("Factorial of "+ n +" is "+ fact);
	}

}
