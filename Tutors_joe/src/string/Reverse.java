package string;

public class Reverse {

	public static void main(String[] args) {
		
		// Program to reverse a string
		
		StringBuilder a = new StringBuilder("Praveen Java Developer");
		System.out.println(a);
		
		// 
		StringBuilder b = new StringBuilder();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b.append(a.charAt(i));
		}
		
		System.out.println(b);

	}

}
