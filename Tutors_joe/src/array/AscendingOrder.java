package array;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// Ascending order
		
		
		int a[]= {1,8,7,9,2,4,3,54,27,87};
		 
		System.out.println("Before sort: ");
		System.out.println(Arrays.toString(a));
		
		int temp; // temp is used to swap the variables
		
		for(int i =0;i<a.length;i++) // i denotes 0th index 
		{
			for(int j = 1+i;j<a.length;j++) // j denotes 1st index
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After sort: ");
		System.out.println(Arrays.toString(a));
		

	}

}
