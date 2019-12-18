package JavaInterviewPrograms;

public class PrintNumbersWithoutUsingLoops 
{
	public static void printNumbers(int number)
	{
		if(number<=10)
		{
			System.out.println(number);
			printNumbers(number+1);
		}
	}	
	
	public static void main(String[] args) 
	{
		printNumbers(1);
	}
}
