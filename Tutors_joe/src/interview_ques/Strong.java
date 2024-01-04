package interview_ques;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		// TO find the given number is strong number or not
		
				/*
				 For example
				 145
				 
				 1 1         = 1
				 4 1*2*3*4   = 24
				 5 1*2*3*4*5 = 120
				 
				 =145 => Strong number
				 */
				int remainder, fact, sum = 0;
				
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the number ");
				int num = in.nextInt();

				int temp = num;
				
				while(temp!=0)
				{
					remainder = temp%10; 
					// System.out.println(remainder); 
					fact = 1;
					
					for (int i=1;i<=remainder;i++)
					{
						fact = fact*i;
					}
					
					sum = sum + fact;
					
					temp = temp/10;
				}
				
				if(sum==num)
				{
					System.out.println(num + " is a strong number");
				}
				else
				{
					System.out.println(num + " is not a strong number");
				}


	}

}
