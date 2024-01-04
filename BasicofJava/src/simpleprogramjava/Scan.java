package simpleprogramjava;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// user input - scanner
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the username");
		String name = obj.nextLine();
		System.out.println("user name is: "+name);
		System.out.println("Enter the user age");
		int age = obj.nextInt();
		System.out.println("user age is: "+age);
		
		System.out.println("Enter your initial");
		char initial = obj.next().charAt(0);
		System.out.println("Your full name is: "+name+" "+initial);
		
		System.out.println("Enter your Height");
		float height = obj.nextFloat();
		System.out.println("user height is: "+height);

	}

}
