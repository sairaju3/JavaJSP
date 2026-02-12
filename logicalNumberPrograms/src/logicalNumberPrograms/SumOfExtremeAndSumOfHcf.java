package logicalNumberPrograms;
import java.util.Scanner;
public class SumOfExtremeAndSumOfHcf 
{
	public static void extremeAndMean(int num)
	{
		int ld=num%10;
		num=num/10;
		int sum=0;
		
		while(num>9)
		{
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		
		int extreme=ld+num;
		System.out.println(sum+" is sum of Mean Digit");
		System.out.println(extreme+" is sum of extreme digit");	
		hcf(sum, extreme);
		
	}
	public static void hcf(int sum , int extreme)
	{
		int range=0;
		if(sum<=extreme)
			range=sum;
		else
			range=extreme;
		int hcf=0;
		for(int i=range; i>=1; i--)
		{
			if(sum%i==0 && extreme%i==0)
			{
				hcf=i;
				break;
			}
		}
		System.out.println(hcf+" is hcf of  sum of Extreme And Mean");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		extremeAndMean(num);
		
		
		
	}
}
