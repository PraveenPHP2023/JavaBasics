package simpleprogramjava;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		String [] color = {"Pink", "Yellow","Blue"};
		System.out.println(Arrays.toString(color)); 

		System.out.println(color[0]);
		
		for (int i =0;i<color.length;i++)
		{
			System.out.println(color[i]);
		}
		
		
		// For each loop
		for(String element: color)
		{
			System.out.print(element+" ");
		}
	}

}
