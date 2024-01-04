package Loop;

public class Even {

	public static void main(String[] args) {
		// Write a Java program to print only even numbers from 1 to 30
		
		for (int i =1;i<=30;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.println(i);
		}
		

	}

}
