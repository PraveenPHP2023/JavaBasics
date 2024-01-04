package simpleprogramjava;

public class Conditional {

	public static void main(String[] args){
		// conditional statement
		// if else
		int age = 21;
		
		if (age>21)
		{
			System.out.println("allow to donate blood");	
		}
		else {
			System.out.println("not allow to donate blood");
		}
		
		
		// Else if 
		
		if (age>21)
		{
			System.out.println("allow to donate blood");	
		}
		else if (age==21)
		{
			System.out.println("also allow to donate blood");
		}
		else {
			System.out.println("not allow to donate blood");
		}
		
		// Switch statement
		
		int day = 13;
		switch(day)
		{
		case 1 :
			System.out.println("Mon");
			break;
		case 2 :
			System.out.println("Tue");
			break;
		case 3 :
			System.out.println("Wed");
			break;
		case 4 :
			System.out.println("Thu");
			break;
		case 5 :
			System.out.println("Fri");
			break;
		
		default :
			System.out.println("no day");
			break;
		
		}
		
	}
}
