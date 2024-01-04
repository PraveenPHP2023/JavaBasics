package loop;
import java.util.*;
public class While_loop {

	public static void main(String[] args) {
		
		// Entry check loop
		
		System.out.println("Enter the limit: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			System.out.println(i);	
			i+=2;
			
			
		}

	}

}
