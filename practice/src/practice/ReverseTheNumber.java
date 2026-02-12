package practice;

import java.util.Scanner;

public class ReverseTheNumber 
{
	private static int sum;
	public static boolean reverse(int num)
	{
		int temp=num;
		int rev=0;
		
		while(num>0)
		{
			int ld = num%10;
			rev = (rev*10)+ld;
			num=num/10;
		}
		int sum=rev+temp;
		return temp==sum;
	}
	public static void check(int num)
	{
	
		if(reverse(num))
		{
			System.out.println("sum = rev");
		}
		else
		{
			boolean rev=reverse(sum);
			System.out.println(rev);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..");
		int num=sc.nextInt();
		check(num);
	}
}
