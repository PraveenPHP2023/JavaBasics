package Abstract;

public class HDFC extends Bank {
	
	public void salary() {
		System.out.println("Salary account");
		
	}

	
	void current() {
		System.out.println("Current account");
		
	}

	public static void main(String[] args) {
		

			HDFC obj = new HDFC();
			obj.current();
			obj.salary();
			obj.savings();
	}


	

}
