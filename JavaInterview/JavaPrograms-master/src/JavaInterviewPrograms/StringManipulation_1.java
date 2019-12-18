package JavaInterviewPrograms;

public class StringManipulation_1 
{
	//String Manipulation - Different Methods in Java
	//Why String is Special in Java - java.lang.String
	//1. length();
	//2. charAt();
	//3. indexOf();
	//4. SubString();
	//5. equal or equalsIgnoreCase();
	//6. trim();
	//7. replace();
	//8. split();
	//9. concat();
	//10. String Concatenation using + operator
	
	public static void main(String[] args)
	{
		String str1 = "The rain is going to start here";
		String str2 = "The rain is going to start here";
		
		System.out.println(str1.length());  //Length of Str1
		
		System.out.println(str1.charAt(10)); //Printing character for Str1
		
		System.out.println(str1.indexOf('s')); //Printing 1st Occurrence of S
		
		System.out.println(str1.indexOf('s', str1.indexOf('s')+1)); //Printing 2nd Occurrence of S
		
		System.out.println(str1.indexOf("to")); //Prints Where exactly to is starting in String
		
		System.out.println(str1.indexOf("Selenium")); //It will return -1 since it is not found in given String
		
		//String comparison
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//SubString
		System.out.println(str1.substring(0, 8)); //To Print required letters using Starting and Ending Index 
		
		//Trim
		String s1 = "    Selenium Best    ";
		System.out.println(s1.trim()); //It will trim only Starting and Ending Spaces
		
		System.out.println(s1.replace(" ",  "")); //SeleniumBest
		
		String date = "01-01-2019";
		System.out.println(date.replace("-", "/"));
		
		//Split
		String test = "Hello_World_Test_Selenium";
		String testValue[] = test.split("_");
		for(int i=0; i<testValue.length; i++)
		{
			System.out.println(testValue[i]);
		}
		
		//Concatenation
		String s2 = "Care";
		System.out.println(s2.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 10;
		int b = 20;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
	}
}
