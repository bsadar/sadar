package Patterns;

public class Pattern1_6  
{
	public static void main(String[] args) 
	{
		int value = 10;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(value);
				value = value + 10;
			}
			System.out.println();
		}
	}
}

//Output:
//102030
//405060
//708090