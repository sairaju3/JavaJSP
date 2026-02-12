package ArraysPP;

import java.util.Scanner;

public class NthLargestE 
{
	public static int nthLargest(int a[]) {
		
		int lag = Integer.MIN_VALUE;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>lag)
			{
				lag=a[i];
			}
		}
		return lag;
	}
	public static void main(String[] args) 
	{
		int[] a = {2,5,1,6,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n type");
		
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			int largest= nthLargest(a);
			System.out.println(largest);
			break;
		}
	}
}
