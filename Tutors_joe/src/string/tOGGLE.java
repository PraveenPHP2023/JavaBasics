package string;

import java.util.Scanner;

public class tOGGLE {

	public static void main(String[] args) {
		// Program to convert given string to toggle word
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string to convert toogle: ");
		String name = obj.nextLine();
		
		StringBuilder a = new StringBuilder(name);
		
		for(int i =0; i<a.length();i++)
		{
			if(a.charAt(i)>=97 && a.charAt(i)<=122)
			{
				int c = a.charAt(i)-32;
				a.setCharAt(i, (char)c);
			}
			
			else if(a.charAt(i)>=65 && a.charAt(i)<=90)
			{
				int c = a.charAt(i)+32;
				a.setCharAt(i, (char)c);
			}
		}
		
		System.out.println(a);

	}

}
