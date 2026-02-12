package practice;

public class ReverseOfNumber 
{
	public static int reverse(int num)
	{
		int rev=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev+10)+ld;
			num=num/10;
			
		}
		sum=temp+rev;
		return sum;
		
	}
	public static void check(int sum)
	{
		`
	}
}
