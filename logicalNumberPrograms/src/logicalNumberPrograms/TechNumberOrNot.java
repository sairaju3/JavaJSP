package logicalNumberPrograms;
import java.util.Scanner;
public class TechNumberOrNot 
{
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int placeValue(int count)
	{
		
		int place =1;
		for(int i=1;i<=count/2;i++)
		{
			place=place*10;
		}
		return place;
	}
	public static void ChechTechOrNot(int num)
	{
		int count = count(num);
		if(count%2==0)
		{
			int square =num*num;
			int counts=count(square);
			if(counts%2==0)
			{
				int place=placeValue(counts);
				int ld=square%place;
				int fh=square/place;
				int sum=fh+ld;
				if(sum==num)
				{
					System.out.println(num+" is a Tech Number");
				}
				else
				{
					System.out.println(num+" is not a Tech Number");
				}
			}
			else
			{
				System.out.println("is not a Tech Number");
			}
		}
		else
		{
			System.out.println(" is not a tech Number");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		ChechTechOrNot(num);
		
	}
}
