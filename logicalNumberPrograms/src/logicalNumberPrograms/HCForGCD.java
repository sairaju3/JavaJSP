package logicalNumberPrograms;
import java.util.Scanner;
public class HCForGCD 
{
	public static int lessThan(int num1,int num2)
	{
		int range =0;
		if(num1<=num2)
			range=num1;
		else
			range=num2;
		return range;
	}
	public static void hcf(int num1,int num2)
	{
		int range =lessThan(num1,num2);
		int hcf=0;
		for(int i=1;i<=range;i++)
		{
			hcf=i;
		}
		System.out.println("HCF of "+hcf);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		hcf(num1,num2);

	}
}
