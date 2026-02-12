package logicalNumberPrograms;

import java.util.Scanner;
public class SpyOrNot 
{
	public static String ckeckSumAndProduct(int num)//return boolean
	{
		int temp=num;
		int sum=0;
		int product=1;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
		}
		if(sum==product)
			return temp+" is a SPY Number";
		else
			return temp+" is not a SPY Number";
		//return sum==product;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(ckeckSumAndProduct(num));
		
		//if(ckeckSumAndProduct(num))
		//	System.out.println(num+" is a SPY Number");
		//else
		//	System.out.println(num+" is Not a SPY Number");
	}
}
