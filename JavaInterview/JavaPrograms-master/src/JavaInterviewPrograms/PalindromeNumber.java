package JavaInterviewPrograms;

public class PalindromeNumber 
{
	public static void isPalindromeNumber(int num)
	{
		System.out.println("Given Number is : " +num);
		int rem=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0)
		{
			rem = num % 10; //Get the Remainder
			sum = (sum*10) + rem;
			num = num / 10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}	
	}
	public static void main(String[] args) 
	{
		isPalindromeNumber(141);
		isPalindromeNumber(142);
		isPalindromeNumber(1);
		isPalindromeNumber(0);
	}
}
