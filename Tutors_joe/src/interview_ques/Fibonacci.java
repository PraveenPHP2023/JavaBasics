package interview_ques;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = in.nextInt();
		
		int a =-1;
		int b =1;
		
		for(int i =1;i<=n;i++) // 1<=5 2<=5 3<=5 4<=5 5<=5
		{
			int c = a+b; // -1+1=0 1+0=1 0+1=1 1+1=2 1+2=3
			System.out.println(c); // 0 1 1 2 3
			a=b; // 1 0 1 1 2
			b=c; // 0 1 1 2 3
		}

	}

}
