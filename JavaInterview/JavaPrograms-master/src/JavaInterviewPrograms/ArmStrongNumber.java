package JavaInterviewPrograms;

public class ArmStrongNumber 
{
	//153 >> 1*1*1 + 5*5*5 + 3*3*3
	public static void isArmStrong(int num)
	{
		System.out.println("Given Number is : " +num);
		int cube = 0;
		int rem;
		int temp;
		
		temp = num;
		
		while(num>0)
		{
			rem = num % 10;
			num = num / 10;
			cube = cube + (rem*rem*rem);
		}
		
		if(temp==cube)
		{
			System.out.println("Given Number is ArmStrong Number");
		}
		else
		{
			System.out.println("Given Number is not ArmStrong Number");
		}
	}
	public static void main(String[] args) 
	{
		isArmStrong(153);
		isArmStrong(103);
	}
}
