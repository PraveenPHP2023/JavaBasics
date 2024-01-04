package interview_ques;

public class Prime_numbers {

	public static void main(String[] args) {
		//write a program to print prime number from 1 to 999
		
		
		
		int f = 0; // dummy variable to count the zeros or divisor
		
		for(int n =1;n<=999;n++)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					f++;
				}
			}
			if(f==2)
			{
				System.out.println(n+" is a prime number");
			}
			
			f=0; // f should be reset to check the next number
		}
		
		
		
		

	}

}
