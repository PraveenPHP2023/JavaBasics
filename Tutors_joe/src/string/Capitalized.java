package string;

import java.util.Scanner;

public class Capitalized {

	public static void main(String[] args) {
		
		// Write a program to capitalized each word in a string
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String to convert Capitalized: ");
		String name = obj.nextLine();
		
		StringBuilder a = new StringBuilder(name);
		System.out.println(a);
		
		if(a.charAt(0)>=97 && a.charAt(0)<=122)
		{
			int c = a.charAt(0)-32;
			a.setCharAt(0, (char) c);
		}
		
		for(int i = 1; i<a.length();i++)
		{
			if(a.charAt(i)==32)
			{
				i++;
				if(a.charAt(i)>=97 && a.charAt(i)<=122)
				{
					int c = a.charAt(i)-32;
					a.setCharAt(i, (char) c);
				}
				
				else if (a.charAt(i)>=65 && a.charAt(i)<=90)
				{
					int c = a.charAt(i)+32;
					a.setCharAt(i, (char)c);
				}
			}
		}
		
		System.out.println(a);

	}

}
