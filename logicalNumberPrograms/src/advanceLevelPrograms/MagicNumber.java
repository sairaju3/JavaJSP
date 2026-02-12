package advanceLevelPrograms;

import java.util.Scanner;

public class MagicNumber 
{
	public static int digitCount(int num)
	{
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num/=10;
		}
		return sum;
	}
	public static void magicNumber(int num)
	{
		while(true)
		{
			int sum=digitCount(num);
			if(num<=9)
			{
				if(sum==1)
				{
					System.out.println(num+" is Magic Numer...");
				}
				else
				{
					System.out.println(num+" is not a Magic number...");
				}
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
		magicNumber(num);
	}
}
