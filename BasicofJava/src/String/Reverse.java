package String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Write a Java program to find whether palindrome or not

		Scanner name = new Scanner(System.in);
		System.out.println("Enter a word to find palindrome or not: ");
		String s = name.nextLine();
		
		String r ="";
		
		int n = s.length();
		
		System.out.println(n);
		
		for(int i = n-1;i>=0;i--)
		{
			r = r+s.charAt(i);
		}
		
		System.out.println(r);
		
		
		if(s.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
