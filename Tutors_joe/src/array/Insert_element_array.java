package array;

import java.util.Arrays;

public class Insert_element_array {

	public static void main(String[] args) {
		// insert a element in an array
		
		int a []= {10,20,30,40,50,60,70,80,90,100};
		
		int index = 2;
		int element = 55;
		
		
		System.out.println("Before sort: "+Arrays.toString(a));
		
		for(int i = a.length-1;i>index;i--) // to insert a element in array we have to start from the last
		{
			a[i] = a[i-1];
		}
		
		a[index] = element;
		
		
		System.out.println("After sort: "+Arrays.toString(a));
	}

}
