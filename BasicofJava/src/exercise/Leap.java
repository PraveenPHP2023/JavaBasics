package exercise;

import java.util.*;

public class Leap {

	public static void main(String[] args) {
	
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int year = obj.nextInt();
		
		
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("Its a Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
