package methods;

public class Mathematical {
	
	public static int power (int base , int power)
	{
		int result = 1;
		
		for (int i =1; i<=power; i++)
		{
			result = result*base;
		}
		
		return result;
			
	}

	public static void main(String[] args) {
	
		System.out.println("Power: "+power(2,4));
	}

}
