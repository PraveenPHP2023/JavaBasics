package array;

public class Duplicate {

	public static void main(String[] args) {
		// Write a program to find duplicate element in an array
		
		int a [] = {1,2,5,5,6,6,7,2};
		
		for(int i =0;i<a.length-1;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if((a[i] == a[j]) && (i!=j)) // index of i and j must not be same and comparing values to find out the duplicate values
				{
					System.out.println("Duplicate element: "+a[j]);
				}
			}
		}

	}

}
