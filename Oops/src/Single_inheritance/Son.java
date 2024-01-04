package Single_inheritance;

public class Son extends Father {
	public void Education()
	{
		System.out.println("Mech");
	}

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.Business();
		obj.vehicle();
		obj.Education();
	}

}
