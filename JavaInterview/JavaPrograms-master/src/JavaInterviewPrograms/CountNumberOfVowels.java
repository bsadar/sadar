package JavaInterviewPrograms;

import java.util.Scanner;

public class CountNumberOfVowels 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Input String ::: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char chars[] = string.toCharArray();
		
		int count = 0;
		for(char c : chars)
		{
			switch(c) 
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number of Vowels in a String ::: " +count);
	}
}
