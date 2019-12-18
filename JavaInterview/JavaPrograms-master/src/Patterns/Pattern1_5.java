package Patterns;

public class Pattern1_5 
{
	public static void main(String[] args)
	{
		int counter = 1;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print(counter++);
			}
			System.out.println();
		}
	}
}

//Output:
//12345678910
//11121314151617181920
//21222324252627282930
//31323334353637383940
//41424344454647484950
//51525354555657585960
//61626364656667686970
//71727374757677787980
//81828384858687888990
//919293949596979899100