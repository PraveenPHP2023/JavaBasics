package interview_ques;

import java.util.*;

public class Sum_Avg {

	public static void main(String[] args) {
		// Sum and Average of the given numbers
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit n: ");
		int n = in.nextInt();
		
		int sum =0;
		int a; // to get the inputs and add in sum
		
		for(int i =1; i<=n;i++)
		{
			System.out.println("Enter the numbers "+i+":");
			a = in.nextInt();
			sum +=a;
		}
		
		System.out.println("The sum of the given numbers is: "+sum);
		System.out.println("The average of the given numbers is: "+sum/n);

	}

}
