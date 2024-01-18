package string;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		
		// Program to convert given string to uppercase
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string to uppercase: ");
		String name = obj.nextLine();
		
		StringBuilder a = new StringBuilder(name);
		System.out.println(a);
		
		for(int i =0; i<a.length();i++) //97-122 a - z
		{
			if(a.charAt(i)>=97 && a.charAt(i)<=122)
			{
				int c = a.charAt(i)-32;
				a.setCharAt(i, (char) c);
			}
		}
		
		System.out.println(a);

	}

}
