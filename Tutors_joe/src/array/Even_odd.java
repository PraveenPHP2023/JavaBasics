package array;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// write a program to count even or odd number in an array
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit n: ");
		int n  = in.nextInt();
		
		int a[] = new int[n];
		
		int e = 0; // to count the even numbers
		int o = 0; // to count the odd numbers
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value for a["+i+"]");
			a[i]=in.nextInt();
		}
		
		for(int element : a)
		{
			if(element%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		
		System.out.println("Total even numbers in array is "+e);
		System.out.println("Total odd numbers in array is "+o);

	}

}
