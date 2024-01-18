package string;

import java.util.Scanner;

public class Lower {

	public static void main(String[] args) {
		// Program to convert given string to lowercase
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String to convert lowercase: ");
		String name = obj.nextLine();
		
		StringBuilder a = new StringBuilder(name);
		System.out.println(a);
		
		for(int i =0; i<a.length();i++)
		{
			if(a.charAt(i)>=65 && a.charAt(i)<=90)
			{
				int c = a.charAt(i)+32;
				a.setCharAt(i,(char) c);
			}
		}
		
		System.out.println(a);

	}

}
