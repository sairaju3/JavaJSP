package practice;

import java.util.Scanner;

public class HappyNum 
{
	public static int square(int num)
	{
		int square=0;
		int sum=0;
		
		while(num>0)
		{
			int ld=num%10;
			square=ld*ld;
			sum=sum+square;
			num=num/10;
		}
		return sum;
	}
	public static void checkHappy(int num)
	{
		while(true)
		{
			int sum=square(num);
			if(sum==1 || sum==4)
			{
				if(sum==1)
					System.out.println("Happy number");
				else
					System.out.println("UnHappy Number");
				break;
			}
			else
				num=sum;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		checkHappy(num);
	}
}
