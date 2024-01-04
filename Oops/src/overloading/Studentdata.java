package overloading;

public class Studentdata {
	public void studet(byte id)
	{
		System.out.println(id);
	}
	
	public void studet(String name)
	{
		System.out.println(name);
	}
	
	public void studet(float salary)
	{
		System.out.println(salary);
	}

	public void studet(long phoneno)
	{
		System.out.println(phoneno);
	}
	
	
	public static void main(String[] args) {
		// Method overloading
		
		Studentdata obj = new Studentdata();
		obj.studet(1);
		obj.studet("Praveen");
		obj.studet(22000);
		obj.studet(8072156507l);

	}

}
