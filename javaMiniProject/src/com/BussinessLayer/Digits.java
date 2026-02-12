package com.BussinessLayer;
//1.Sum of Digits
//2.Product of Digits
//3.Sum of Even Digits
//4.Sum of Extreme And Sum of Mean Digits
//5.Sum of first Half and Second Half Digits
public class Digits 
{
	//1.Sum of Digits
	public int sumOfDigits(int num)
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
	//2.Product of Digits
	public int productOfDigits(int num)
	{
		int product=1;
		while(num>0)
		{
			int ld=num%10;
			product=product*ld;
			num=num/10;
		}
		return product;
	}
	//3.Sum of Even Digits
	
	public int sumOfEvenDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0)
			{
				sum=sum+ld;
			}
			num=num/10;
		}
		return sum;
	}
	//4.Sum of Extreme And Sum of Mean Digits
	public void sumOfExtreme(int num)
	{
		int temp=num;
		int ld=num%10;
		num=num/10;
		int extreme=0;
		int mean=0;
		while(num>9)
		{
			int last=num%10;
			mean=mean+last;
			
			num=num/10;
		}
		extreme=ld+num;
		System.out.println("Sum of Mean digit is "+mean);
		System.out.println("Sum of Extreme digit is "+extreme);
	}
	public int sumOfMean(int num)
	{
		int temp=num;
		int ld=num%10;
		num=num/10;
		int extreme=0;
		int mean=0;
		while(num>9)
		{
			int last=num%10;
			mean=mean+last;
			num=num/10;
		}
		return mean;
	}
	//5.Sum of first Half and Second Half Digits
	public int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public int placeValue(int num)
	{
		int place = 1;
		int count=count(num);
		for(int i = 1 ; i<=count/2;i++)
		{
			place = place * 10;
		}
		return place;
	}
	
	public int sumOfFirstAndSecondHalf(int num)
	{
		int place = placeValue(num);
		int secondHalf = num % place;
		int firstHalf = num / place;
		int first=sumOfDigits(firstHalf);
		int second=sumOfDigits(secondHalf);
		int sum = first + second;
		
		return sum;
	}
}
