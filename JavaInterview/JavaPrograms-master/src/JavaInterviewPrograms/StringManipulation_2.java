package JavaInterviewPrograms;

public class StringManipulation_2
{
	public static void main(String[] args)
	{
		//1. startsWith and endsWith methods of String Class
		/*String str1 = "Selenium Java";
		boolean start = str1.startsWith("Selenium");
		System.out.println("The Status is ::: " +start);
				
		String str2 = "Selenium Java";
		boolean end = str2.endsWith("Java");
		System.out.println("The Status is ::: " +end);*/
		
		
		//2. actual and expected methods with equals() method
		/*String actual = "Selenium Java";
		String expected = "Selenium Java";
		boolean result = actual.equals(expected);
		System.out.println("The Status is ::: " +result);*/
		
		
		//3. actual and expected methods with equalsIgnoreCase() method
		/*String actual = "Selenium Java";
		String expected = "Selenium java";
		boolean result = actual.equalsIgnoreCase(expected);
		System.out.println("The Status is ::: " +result);*/
		
		
		//4. contains method
		/*String actual = "Selenium Java Python Appium";
		String expected = "Selenium";
		boolean result = actual.contains(expected);
		System.out.println("The Status is ::: " +result);*/
		
		
		//5. Trim
		/*String actual = "     Selenium     Java     ";
		String result = actual.trim();
		System.out.println("The Status is ::: " +result);*/
		
		
		//6. charAt
		/*String expected = "Selenium";
		System.out.println(expected.charAt(4));*/
		
		
		//7. Split with For loop
		/*String actual = "Selenium-Java-Appium-Winium";
		String tools[] = actual.split("-");
		for(int i=0; i<tools.length; i++)
		{
			System.out.println("Value for "+i+" is ::: " +tools[i]);
		}*/
		
		
		//8. Split with For and If loop
		String actual = "Selenium-Java-Appium-Winium";
		String tools[] = actual.split("-");
		for(int i=0; i<tools.length; i++)
		{
			System.out.println("Value for "+i+" is ::: " +tools[i]);
			if(tools[i].equalsIgnoreCase("Java"))
			{
				System.out.println("Test Passed");
			}
		}
	}
}
