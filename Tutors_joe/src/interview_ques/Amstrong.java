package interview_ques;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the three digit Number: ");
		int num = in.nextInt();
		
		int digit1, digit2, digit3, temp =num;
		
		digit3 = temp%10;
		temp = temp/10;
		
		digit2 = temp%10;
		temp = temp/10;
		
		digit1 = temp%10;
		temp = temp/10;
		
		int result = (int) ((int) ((int) (Math.pow(digit3, 3))+ Math.pow(digit2, 3))+Math.pow(digit1,3));
		
				if(num==result)
				{
					System.out.println("Amstrong");
				}
				else
				{
					System.out.println("Not a Amstrong");
				}

	}

}
