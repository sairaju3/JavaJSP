package logicalNumberPrograms;



import java.util.Scanner;

public class SunnyNumberCheck
{
	public static boolean checkPerfectSquareNumber(int num)
	{
		int i = 1;
		while (true)
		{
			int ps = i*i;
			if (ps==num)
				return true;
				
			if (ps>num)
			    return false;
			i++;
		}
	}
	public static void checkSunnyNumber(int num)
	{
		int temp = num+1;
		if (checkPerfectSquareNumber(temp))
		{
			System.out.println(num+" is  a Sunny Number...");
		}
		else
		System.out.println(num+" is not a Sunny Number...");			
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();
		
		checkSunnyNumber(num);
	}

}