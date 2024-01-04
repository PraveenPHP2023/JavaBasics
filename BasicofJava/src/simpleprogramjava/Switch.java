package simpleprogramjava;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = num.nextInt();
		System.out.println("Enter number2: ");
		int b = num.nextInt();
		
		char c ;
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter a operator: ");
		c = op.next().charAt(0);
		
		
		switch (c)
		{
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
			
		case '%':
			System.out.println(a%b);
			break;
			
		default :
			System.out.println("Enter a valid operator");
			
		}

	}

}
