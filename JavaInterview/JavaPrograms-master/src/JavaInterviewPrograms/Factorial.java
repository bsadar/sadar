package JavaInterviewPrograms;

public class Factorial
{
	//Logic -> Factorial of 0 & 1 is 1 only.
	//Without Using Recursive.
	//Fact of 5 >> 5 * 4 * 3 * 2 * 1
	//Fact of 4 >> 4 * 3 * 2 * 1
	public static int factorial(int num)
	{
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	//Using Recursive function - The function is calling itself.
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return (num * fact (num-1));
	}
	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
		
		System.out.println(fact(5));
		System.out.println(fact(0));
	}
}
