package basicOfJava;
import java.util.*;

public class Leap_year {

	public static void main(String[] args) {
		// if else Leap year program
		
		int year ;
		System.out.println("Enter the year:");
		Scanner obj = new Scanner(System.in);
		year = obj.nextInt();
		
		if(year%4==0 || year%100 ==0 && year % 400==0)
		{
			System.out.println(year+" "+" is a Leap year");
		}
		else
		{
			System.out.println(year+" "+" is not a Leap year");
		}

	}

}
