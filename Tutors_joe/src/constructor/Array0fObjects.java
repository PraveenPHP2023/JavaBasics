package constructor;
class student
{
	int rollno;
	String name;
	
	student(int rollno, String name)
	{
		this.rollno =  rollno;
		this.name =  name;
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("---------------------------");
	}
	
}
public class Array0fObjects {

	public static void main(String[] args) {
		// Array of objects
		
		student [] o = new student[3];
		
		o[0]= new student(1,"Raja");
		o[1]= new student(2,"Krishna");
		o[2]= new student(3,"Gokul");
		
		
		for(int i =o.length-1;i>=0;i--)
		{
			o[i].print();
		}
		
		for(int i =0; i<o.length; i++)
		{
			o[i].print();
		}
		

	}

}
