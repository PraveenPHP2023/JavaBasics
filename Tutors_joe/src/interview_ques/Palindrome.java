package interview_ques;

public class Palindrome {
	public static boolean pali(int x)
	{
		int reverse =0;
		int rem;
		int temp =x;
		
		if(x<0)
		{
			return false;
		}
		
		while(temp!=0)
		{
			rem = temp%10;
			reverse = (reverse*10)+rem;
			temp = temp/10;
		}
		
		if(reverse == x)
		{
			return true;
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
		
		
		System.out.println(Palindrome.pali(121));
		System.out.println(Palindrome.pali(1221));
	}

}
