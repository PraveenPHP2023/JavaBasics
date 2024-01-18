package methods;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionsArray {
	
	public static int[] Sortarray()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the limit n: ");
		int n = obj.nextInt();
		
		int [] arr = new int[n];
		
		for(int i =0;i<n; i++)
		{
			System.out.println("Enter the values "+i+":");
			arr[i] = obj.nextInt();
		}
		
		
		Arrays.sort(arr);
		
		// returning a array
		return arr;
		
		
	}

	public static void main(String[] args) {
		// Returning array in a function
		
		int a[] = Sortarray();
		
		for (int element: a)
		{
			System.out.println(element);
		}

	}

}
