package array;

import java.util.Scanner;

public class one_array {

	public static void main(String[] args) {
		
		
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		
		// Accessing elements in array
		System.out.println(a[2]);
		
		// Printing all elements using for loop
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		// Printing all elements using enhanced for loop
		for(int element : a)
		{
			System.out.println(element);
		}
		
		int b []; // declaring array
		b = new int [10]; // Allocating memory to array
		
		
		for(int i =0; i<b.length;i++)
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the value of array "+i);
			 b[i]= obj.nextInt();
		}
		
	}

}
