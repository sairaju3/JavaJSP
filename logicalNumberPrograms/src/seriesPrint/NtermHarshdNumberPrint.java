package seriesPrint;

import java.util.Scanner;

public class NtermHarshdNumberPrint 
{
	public static boolean CheckHarshadNumber(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return temp%sum==0;
	}
	public static void NHarshadNumberPrint(int num)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int n=i;
			if(CheckHarshadNumber(n))
			{
				System.out.print(n+"");
				count++;
				if(count!=num)
					System.out.print(",");
			}
			if(count==num)
				break;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int num = sc.nextInt();
		NHarshadNumberPrint(num);
	}
}
