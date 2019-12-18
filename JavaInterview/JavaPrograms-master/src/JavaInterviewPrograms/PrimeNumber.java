package JavaInterviewPrograms;

public class PrimeNumber 
{
	//Logic -> The Number that divides by itself is Prime Number.
	//Examples -> 17/17 - Yes, 2/2 - Yes, 13/13 - Yes, 14/2 - No & 6/2 - No.
	//0 & 1 are not Prime Numbers.
	public static boolean isPrimeNumber(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i=2; i<num; i++)
		{
			if(num % 2 == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//To Print Prime Numbers between the Range
	public static void getPrimeNumbers(int num)
	{
		for(int i=2; i<=num; i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("2 is a Prime Number:" +isPrimeNumber(2));
		System.out.println("0 is not a Prime Number:" +isPrimeNumber(0));
		System.out.println("-1 is not a Prime Number:" +isPrimeNumber(-1));
		System.out.println("3 is a Prime Number:" +isPrimeNumber(3));
		System.out.println("14 is not a Prime Number:" +isPrimeNumber(14));
		
		getPrimeNumbers(20);
	}
}
