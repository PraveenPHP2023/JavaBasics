package interfac;

public class HDFC implements Bank { // To access a interface we use implements 
	@Override
	public void salary() {
		System.out.println("Salary account");
		
	}

	@Override
	public void savings() {
		System.out.println("Savings account");
		
	}

	@Override
	public void current() {
		System.out.println("Current account");
		
	}

	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		obj.current();
		obj.salary();
		obj.savings();

	}

	

}
