package varargs;

class Demo{
	
	public static void getnames(String... name)
	{
		for(String element:name)
		{
			System.out.println(element);
		}
	}
	
	public static void getrollno(int... rollno)
	{
		for(int element:rollno)
		{
			System.out.println(element);
		}
	}
}

		



public class MethodVarArgs {

	public static void main(String[] args) {
		
		Demo.getnames("Kumar","Shanthi","Praveen","Dhivya","PradhiHasini");
		
		Demo.getrollno(1,2,3,4,5,6,7,8,9,10);
	}

}
