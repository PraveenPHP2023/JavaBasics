package interview_ques;

import java.util.Scanner;

public class Multi_Tables {

	public static void main(String[] args) {
		// write a program to print the multiplication tables
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the table");
		int t = in.nextInt();
		
		System.out.println("Enter the Limit");
		int n = in.nextInt();
		
		for(int i =1; i<=n;i++)
		{
			System.out.println(t+ "*" +i+ "=" +(t*i));
		}
		
		

	}

}
