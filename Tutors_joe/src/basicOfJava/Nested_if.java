package basicOfJava;
import java.util.*;

public class Nested_if {

	public static void main(String[] args) {
	
		/*
		 Nested if Statement
		 A company insurance its drivers in the following cases :
		 	a. If the driver is married.
		 	b. If the driver is unmarried, male & above 30 years of age.
		 	c. If the driver is unmarried, female & above 25 years of age. 
		 */
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the martial status: M/U ");
		char martial = obj.next().charAt(0);
		
		
		if(martial =='u' || martial == 'U') 
		{
			System.out.println("Enter the Gender: M/F");
			char gender = obj.next().charAt(0);
			System.out.println("Enter the age: ");
			int age = obj.nextInt();
			
			if((gender == 'M' || gender == 'm') && age >=30)
			{
				System.out.println("Eligible for Insurance");
			}
			else if ((gender == 'f' || gender == 'F') && age >=25)
			{
				System.out.println("Eligible for Insurance");
			}
			else {
				System.out.println("Not eligible for Insurance");
			}
			
		}
		else if(martial == 'm' || martial == 'M')
		{
			System.out.println("Eligible for Insurance");
		}
		

	}

}
