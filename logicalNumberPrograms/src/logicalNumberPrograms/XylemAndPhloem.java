package logicalNumberPrograms;

import java.util.Scanner;
public class XylemAndPhloem 
{
	public static boolean mean(int num)
	{
		int lastdigit=num%10;
		num=num/10;
		int sum=0;
		while(num>9)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum==lastdigit+num;
	}
	public static void check(int num)
	{
		if(mean(num))
			System.out.println(num+" is Xylem number");
		else
			System.out.println(num+" is Phloem number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		check(num);
	}
}
