package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateWords 
{
	public static void findDuplicateWord(String str)
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		String string[] = str.split(" ");
		
		for(String tempString : string)
		{
			if(hashMap.get(tempString) != null)
			{
				hashMap.put(tempString, hashMap.get(tempString) + 1);
			}
			else
			{
				hashMap.put(tempString, 1);
			}
		}
		
		//To Print all the Words that are appeared in a String.
		System.out.println(hashMap);
		
		System.out.println("################################");
		
//		First Way to Print Only and Only Duplicate Words from a String.
//		Iterator<String> tempString = hashMap.keySet().iterator();
//		while(tempString.hasNext())
//		{
//			String temp = tempString.next();
//			if(hashMap.get(temp) > 1)
//			{
//				System.out.println("The Word " + temp + " appeared " + hashMap.get(temp) + " Times.");
//			}
//		}
		
//		Second Way to Print Only and Only Duplicate Words from a String.
		Set<String> tempString = hashMap.keySet();
		for(String temp : tempString)
		{
			if(hashMap.get(temp) > 1)
			{
				System.out.println("The Word " + temp + " appeared " + hashMap.get(temp) + " Times.");
			}	
		}
	}
	
	public static void main(String args[])
	{
		findDuplicateWord("I am am Learning Learning Java Java");
	}
}
