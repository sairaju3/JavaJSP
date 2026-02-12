package practice;

import java.awt.geom.CubicCurve2D;
import java.util.Scanner;

public class EvilNumber 
{
	public static int binary(int num)
	{
		int place=1;
		int binary=0;
		int count=0;
		while(num>0)
		{
			int rem=num%2;
			if(rem==1)
			{
				count++;
			}
//			binary=binary+(rem*place);
//			place=place*10;
			num=num/2;
		}
		//System.out.println(binary);
		return count;
	}
	public static void check(int num)
	{
		int count=binary(num);
		if(count%2==0)
		{
			System.out.println("Evil Number");
		}
		else
		{
			System.out.println("Not a Evil Number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value");
		int num=sc.nextInt();
		check(num);
	}
}
