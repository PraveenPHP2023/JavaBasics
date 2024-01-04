package simpleprogramjava;
import java.util.*;

public class Leap {

	public static void main(String[] args) {
		// Write a Java program to find whether it's leap year or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int year = sc.nextInt();
		
		
		if (year%400 == 0 )
		{
			System.out.println("Its a leap year");
		}
		else if ((year%4==0) &&(year%100!=0))
		{
			System.out.println("Its a leap year");
		}
		else 
		{
			System.out.println("Not a leap year");
		}
		
		
		

	}

}
