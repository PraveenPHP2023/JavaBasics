package interview_ques;



public class amstrong_num {

	public static void main(String[] args) {
		// Write a program to find the amstrong number from 100 to 999
		
		int digit1, digit2, digit3, temp;
	
		for(int num=100;num<=999;num++)
		{
			temp = num;
			
			digit3 = temp%10;
			temp = temp/10;
			
			digit2 = temp%10;
			temp = temp/10;
			
			digit1 = temp%10;
			temp = temp/10;
			
			int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			
			if(result==num)
			{
				System.out.println(num + " is a Palindrome number");
			}
		}
	

	}

}
