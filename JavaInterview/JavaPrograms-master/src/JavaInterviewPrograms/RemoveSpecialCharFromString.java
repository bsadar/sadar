package JavaInterviewPrograms;

public class RemoveSpecialCharFromString 
{
	public static void main(String[] args) 
	{
		//Using Regular Expression
		String s1 = "@@#$12WorldOfSelenium*() {}";
		
		s1 = s1.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(s1);
	}
}
