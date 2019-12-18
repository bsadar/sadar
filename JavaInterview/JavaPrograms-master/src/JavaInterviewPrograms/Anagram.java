package JavaInterviewPrograms;

public class Anagram 
{
	public static boolean areAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		int value = 0;
		for(int i=0; i<str1.length(); i++)
		{
			value = value ^ (int) str1.charAt(i);
			value = value ^ (int) str2.charAt(i);
		}		
		return value == 0;
	}
	public static void main(String[] args) 
	{
		String str1 = "SeleniumJava";  
	    String str2 = "JavaSelenium";  
	    if(areAnagram(str1, str2))
	    {
	        System.out.println("The 2 Strings are Anagram of Each Other");  
	    }
	    else
	    {
	        System.out.println("The 2 Strings are not Anagram of Each Other");    
	    } 
	}
}
