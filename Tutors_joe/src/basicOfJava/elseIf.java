package basicOfJava;
import java.util.*;

public class elseIf {

	public static void main(String[] args) {
		
		int avg ;
		System.out.println("Enter the average mark: ");
		Scanner obj = new Scanner(System.in);
		avg = obj.nextInt();
		
		if(avg>=90)
		{
			System.out.println("A grade");
		}
		else if (avg>=80)
		{
			System.out.println("B grade");
		}
		
		else if (avg>=70)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("D grade");
		}

	}

}
