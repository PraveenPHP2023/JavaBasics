package exercise;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// Write a Java program to print Pyramid star pattern
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = obj.nextInt();
		int i ;
		int j ; 
		int k ;
		
		for(i =1;i<=n;i++)
		{
			for( k =1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
