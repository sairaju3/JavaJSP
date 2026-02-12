package com.BussinessLayer;

public class Advance1 
{
	public int checkHcf(int num1,int num2)
	{
		int range =0;
		if(num1<=num2)
			range=num1;
		else
			range=num2;
		int hcf=0;
		for(int i=1;i<=range;i++)
		{
			hcf=i;
		}
		//System.out.println("HCF of "+hcf);
		return hcf;
	}
	public int checkLCM(int num1,int num2)
	{
		int range =0;
		if(num1<=num2)
			range=num1;
		else
			range=num2;
		int hcf=0;
		for(int i=1;i<=range;i++)
		{
			hcf=i;
		}
		//System.out.println("HCF of "+hcf);
		int lcm=(num1*num2)/hcf;
		return lcm;
	}
	public int convertBinaryToDecimal(int num)
	{
	
		int power=0;
	    int decimal=0;
		if (num==0)
		{
			System.out.println();
		}
		else
		{
     		while(num>0)
			{
				int ld = num%10;
				if(ld==1)
				{
					int expo=1;
					for(int i=1;i<=power;i++)
					{
						expo=expo*2;
					}
					decimal=decimal+expo;
				}
				power++;
				num=num/10;
				}
			//System.out.println(decimal);
     		
			}
		return decimal;
	}
	public int convertDecimalToBinary(int num) 
	{
		int temp=num;
		int place=1;
		int binary=0;
		while(num>0)
		{
			int rem = num%2;
			binary=binary+(rem*place);
			place=place*10;
			num=num/2;
		}
		//System.out.println(temp+" is converted into "+binary);
		return binary;
	}
//	1.First n terms
//	2.Nth Fibonacci Term
	
	public void nTermFibonacci(int num)
	{
		int sum=0;
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}
	public int nthfibonacciTerm(int num)
	{
		int sum=0;
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<num;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
		}
		return a;
	}
	public void nPerfectSquare(int num)
	{
		System.out.println("The first "+num+" perfect Square");
		for(int i=1;i<=num;i++)
		{
			int ps=i*i;
			System.out.println(ps);
		}
	}
	public boolean checkPerfectSquare(int num)
	{
		int ps;
		int i=1;
		while(true)
		{
			ps=i*i;
			if(ps==num)
			{
				return true;
			}
			if(ps>num)
			{
				return false;
			}
			i++;
		}
	}
	public int nthPerfectSquare(int num)
	{
		int count=0;
		int next;
		for(int i=1;;i++)
		{
			 next=i;
			if(checkPerfectSquare(next))
			{
				count++;
			}
			if(count==num)
			{
				//System.out.println("The "+num+" th Palindrome Number = "+next);
				break;
			}
		}
		return next;
	}
}
