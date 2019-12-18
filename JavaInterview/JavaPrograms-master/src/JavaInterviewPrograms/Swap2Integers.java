package JavaInterviewPrograms;

public class Swap2Integers 
{
	//Swap 2 Integers without using Temp or Third Variable
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 10;
		
		//1. Using Temp Variable
		//int temp;
		//temp = x;
		//x = y;
		//y = temp;
		
		//2. Using Addition Arithmetic Operator
		//x = x + y; //15
		//y = x - y; //5
		//x = x - y; //10 
		
		//3. Using Multiply Arithmetic Operator
		//x = x * y; //50
		//y = x / y; //5
		//x = x / y; //10
		
		//4. Using XOR Operator
		x = x ^ y; //15 >> 1111
		y = x ^ y; //10 >> 1010
		x = x ^ y; //5  >> 0101
		
		System.out.println("X Value is ::: " +x);
		System.out.println("Y Value is ::: " +y);
	}
}
