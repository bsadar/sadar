package JavaInterviewPrograms;

public class Swap2Strings 
{
	//Swap 2 Strings without using Temp or Third Variable
	public static void main(String args[])
	{
		String str1 = "Hello";
		String str2 = "Python";
		
		System.out.println("Before Swapping :::");
		System.out.println("The Value of A is ::: " +str1);
		System.out.println("The Value of B is ::: " +str2);
		
		
		//Using Third or Temp Variable
		//String temp;
		//temp = str1;
		//str1 = str2;
		//str2 = temp;
		
		
		//Without Using Third or Temp Variable
		//1. First We need to Append A and B
		str1 = str1+str2; //HelloJava
		
		//2. Store initial String str1 in String str2
		str2 = str1.substring(0, str1.length()-str2.length());
		
		//3. Store initial String str2 in String str1
		str1 = str1.substring(str2.length());
		
		System.out.println("After Swapping :::");
		System.out.println("The Value of A is ::: " +str1);
		System.out.println("The Value of B is ::: " +str2);
	}
}
