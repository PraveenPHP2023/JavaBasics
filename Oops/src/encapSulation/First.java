package encapSulation;

import java.time.LocalDateTime; // To show date and time 
import java.time.LocalDate; // To show date
import java.time.LocalTime; // To show Time
public class First {

	public static void main(String[] args) {
		
		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj);

		LocalDate obj1 = LocalDate.now();
		System.out.println(obj1);
		
		LocalTime obj2 = LocalTime.now();
		System.out.println(obj2);
	}

}
