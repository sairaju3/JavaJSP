package practice;

import java.util.Scanner;
public class MagicNum 
{
	public static int check(int num)
	{
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;	
		}
		return sum;
	}
	public static void checkMagic(int num)
	{
		while(true)
		{
			int sum=check(num);
			if(num<=9)
			{
				if(sum==1)
					System.out.println("Magic number");
				else
					System.out.println("Not a Mgic number");
				break;
			}
			else
				num=sum;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number....");
		int num=sc.nextInt();
		checkMagic(num);
	}
}
