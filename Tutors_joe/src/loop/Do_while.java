package loop;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// Exit check loop
		
		System.out.println("Enter the limit: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		 
		int i =1;
		
		
		do{
			System.out.println(i);
			i++;
		} while(i<=n);

	}

}
