package ArraysPP;

public class SumOfzEvenEleIsStrong 
{
	public static boolean checkStrong(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			int fact=1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		return sum==temp;
	}
	public static void sumOfAllEle(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Even Elements : "+sum);
		if(checkStrong(sum))
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
	public static void main(String[] args) 
	{
		int[] arr= {1, 2, 145};
		sumOfAllEle(arr);
	}
}
