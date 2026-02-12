package com.BussinessLayer;
//1.Exponential of Each Digit to Count of Digits
//2.Sum of Exponential of Each Digits to Count of Digits
//3.Sum of Exponential of Even Digits to Count of Digits
//4.Sum of Exponential of Odd Digits to Count of Even Digits


public class Exponential 
{
	//1.Exponential of Each Digit to Count of Digits
	public int count(int num)
	{
		int count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public int exponentila(int base,int power)
	{
		
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public void countofExponential(int num)
	{
		int power=count(num);
		while(num>0)
		{
			int ld=num%10;
			int expo=exponentila(ld,power);
			System.out.println(expo);
			num=num/10;
		}
		
	}
	public int sumOfExponential(int num)
	{
		int power=count(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int expo=exponentila(ld,power);
			sum=sum+expo;
			num=num/10;
		}
		return sum;
	}
	public int sumExponentialOfEvenDigit(int num)
	{
		int power=count(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0)
			{
				int expo=exponentila(ld,power);
				sum=sum+expo;
			}
			num=num/10;
		}
		return sum;
	}
	public int sumExponentialOfoddDigit(int num)
	{
		int power=count(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2!=0)
			{
				int expo=exponentila(ld,power);
				sum=sum+expo;
			}
			num=num/10;
		}
		return sum;
	}
}
