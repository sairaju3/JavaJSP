package com.BussinessLayer;

public class Factors 
{
	public void findFactors(int num)
	{
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
		
	}
	public int sumOfFactors(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public int productOfFactors(int num)
	{
		int product=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				product=product*i;
			}
		}
		return product;
	}
	public void factorsofEachDigit(int num)
	{
		while(num>0)
		{
			int ld=num%10;
		
			for(int i=1;i<=ld;i++)
			{
				if(ld%i==0)
				{
					System.out.println("Factors of Each Digit is "+i);
				}
			}
			num=num/10;
		}
	}
}
