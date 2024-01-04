package array;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		
		int	a[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b [][]= new int [3][3];
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the value of b["+i+"] "+"b["+j+"]:");
				b[i][j]=in.nextInt();
			}
			System.out.println();
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		// enhanced for loop to print two dimensional array
		
		for(int k[]:b)
		{
			for(int element:k)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
