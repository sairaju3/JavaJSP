package com.BussinessLayer;

import java.util.Scanner;

//1.Check Prime
//2.Nth prime
//3.Next Prime
public class Prime 
{
	public boolean checkPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count==2 ;
	}
	public int nthPrime(int num)
	{
		int count=0;
		int next;
		for(int i=1;;i++)
		{
			next=i;
			if(checkPrime(next))
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
	public int nextPrime(int num)
	{
		int next;
		for(int i=num+1;;i++)
		{
			 next = i;
			if(checkPrime(next))
			{
				//System.out.println("The "+num+" is "+next);
				break;
			}
		}
		return next;
	}
	//Check TwistedPrime
	public int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public boolean checkTwistedPrime(int num)
	{
		int rev=reverse(num);
		if(checkPrime(num))
		{
			if(checkPrime(rev))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public int nthTwistedPrime(int num)
	{
		int count=0;
		int next=0;
		for(int i=1;;i++)
		{
			 next=i;
			 if(checkTwistedPrime(next))
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
	public int nextTwistedPrime(int num)
	{
		int next=0;
		for(int i=num+1;;i++)
		{
			 next=i;
			if(checkTwistedPrime(next))
			{
				//System.out.println("The Next Twisted Prime number "+num+" is "+next);
				break;
			}
		}
		return next;
	}
	
	// MEGA PRIME  
	public boolean checkMegaPrime(int num)
	{
		int temp=num;
		if(checkPrime(num))
		{
			while(num>0)
			{
				int ld=num%10;
				
				if(!checkPrime(ld))
				{
					return false;
					//System.out.println(temp+" is not A mega Number...");
					//break;
				}
				num=num/10;
			}
//			if(num==0)
//			{
//				return true;
//				//System.out.println(temp+" is a Mega Prime Number...");
//			}
//			
		}
		else
			return false;
		return num==0;
	}
	public int nthMeagPrime(int num)
	{
		int next=0;
		int count=0;
		for(int i=1;;i++)
		{
			next=i;
			if(checkMegaPrime(next))
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
	public int nextMegaPrime(int num)
	{
		int next=0;
		for(int i=num+1;;i++)
		{
			 next=i;
			if(checkMegaPrime(next))
			{
				//System.out.println("The Next Mega Prime number "+num+" is "+next);
				break;
			}
		}
		return next;
	}

}
