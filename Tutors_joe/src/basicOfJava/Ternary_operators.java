package basicOfJava;

public class Ternary_operators {

	public static void main(String[] args) {
		// Conditional operators or ternary operators in java
		
		int marks = 89;
		
		String Grade = marks>=90? "A grade" : marks>=80 ? "B grade" : marks>=70 ? "C grade": marks>=60 ? "D grade" : marks>=35 ? "E grade" : "Fail"; 
				
		System.out.println(Grade);
	}

}
