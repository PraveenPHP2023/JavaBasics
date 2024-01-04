package hybridInherit;

public class Daughter extends Father{
	public void business()
	{
		System.out.println("I runs a successfull business");
	}

	public static void main(String[] args) {
		
		Daughter d = new Daughter();
		d.properties();
		d.business();
		

	}

}
