package com.BussinessLayer;

public class Advance 
{
	//Palindrome
	public  boolean checkPalindrome(int num)
	{
		int reverse = 0;
		int temp=num;
		while(num>0)
		{
			int ld = num%10;
			reverse=(reverse*10)+ld;
			num=num/10;
		}
		 return reverse==temp;
					
	}
	
	public int nthPalindrome(int num)
	{
		int count=0;
		int next;
		for(int i=1;;i++)
		{
			 next=i;
			if(checkPalindrome(next))
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
	
	// SPY
	
	public boolean checkSpy(int num)
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
		return sum==product;
	}
	
	// Armstrong
	
	public  int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		return count;
	}
	public  int exponential(int base,int n)
	{
		int expo=1;
		for(int i=1;i<=n;i++)
		{
			expo=expo*base;
		}
		return expo;
	}
	public  boolean checkArmStrongNumber(int num)
	{
		int power = count(num);
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			
			int expo=exponential(ld,power);
			sum=sum+expo;
			
			num=num/10;
		}
		return sum==temp;
	}
	public  int nthamstrongNumber(int num)
	{
		
		int count=0;
		int next;
		for(int i=1;;i++)
		{
			next=i;
			if(checkArmStrongNumber(num))
			{
				count++;
			}
			if(count==num)
			{
				break;
			}
			
		}
		return next;
	}
	
	
	
	// TECH Number
	
	public int placeValue(int count)
	{
		
		int place =1;
		for(int i=1;i<=count/2;i++)
		{
			place=place*10;
		}
		return place;
	}
	public  boolean CheckTech(int num)
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
					return true;
					//System.out.println(num+" is a Tech Number");
				}
				else
				{
					return false;
					//System.out.println(num+" is not a Tech Number");
				}
			}
			else
			{
				return false;
				//System.out.println("is not a Tech Number");
			}
		}
		else
		{
			return false;
			//System.out.println(" is not a tech Number");
		}
		
	}
	
	// Happy Number

		public static int digit(int num)
		{
			int sum=0;
			int square=0;
			while(num>0)
			{
				int ld=num%10;
				square=ld*ld;
				sum=sum+square;
				num=num/10;
			}
			return sum;
		}
		public boolean checkHappyNumber(int num)
		{
			while(true)
			{
				int sum=digit(num);
				if(sum==1 || sum==4)
				{
					if(sum==1)
					{
						return true;
						//System.out.println(sum+" is Happy number..");
					}
					else 
					{
						return false;
						//System.out.println(sum+" is unHappy");
					}
				}
				else
				{
				num=sum;
				}
			}
		}
		public int nthHappyNumber(int num)
		{
			int count=0;
			int next;
			for(int i=1;;i++)
			{
				 next=i;
				if(checkHappyNumber(next))
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
	
	//Magic Number
	
	public int digitCount(int num)
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
	public  boolean checkMagicNumber(int num)
	{
		while(true)
		{
			int sum=digitCount(num);
			if(num<=9)
			{
				if(sum==1)
				{
					return true;
					//System.out.println(num+" is Magic Numer...");
				}
				else
				{
					return false;
					//System.out.println(num+" is not a Magic number...");
				}
			}
			else
				num=sum;
			
		}
	}
	public int nthMagicNumber(int num)
	{
		int count=0;
		int next;
		for(int i=1;;i++)
		{
			 next=i;
			if(checkMagicNumber(next))
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

