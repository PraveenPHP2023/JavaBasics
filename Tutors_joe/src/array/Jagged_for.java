package array;

public class Jagged_for {

	public static void main(String[] args) {
		
		int a[][] = { 
				{10,20,30,40},
				{10,20,30},
				{10,20,30,40}	
		};
		
		for(int k[]: a)
		{
			for(int element :k)
			{
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}
