package exercise;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// Find the sum of first 15 natural numbers
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = obj.nextInt();
		
		int sum =0;
		
		for (int i =1;i<=n;i++)
		{
			sum +=i;
		}
		
		System.out.println(sum);
		
		

	}

}
