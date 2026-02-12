
// WAP to Check Whether the Given Number is Perfect Or Not
package logicalNumberPrograms;

import java.util.Scanner;
class  PerfectNumberOrNot
{
	public static boolean perfectOrNot(int num)
	{
		int sum=0;
		for(int i=1;i<num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		return sum==num;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number.");
		int num=sc.nextInt();
		if(perfectOrNot(num))
			System.out.println(num+" is a Perfect Number.");
		else
			System.out.println(num+" is Not a Perfect Number");
	}
}

