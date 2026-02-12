package advanceProgram1;

import java.util.Arrays;

public class PerfixSumArray 
{
	public static int[] findPerfix(int[] arr)
	{
		int[] prefixsum = new int[arr.length]; 
		for(int i=0;i<=arr.length-1;i++)
		{
			int ele=0;
			for(int j=i;j>=0;j--)
			{
				 ele =ele+arr[j];
			}
			prefixsum[i]=ele;
		}
		return prefixsum;
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,4,7,5,1,6};
		System.out.println(Arrays.toString(arr));
		int[] sum=	findPerfix(arr);
		System.out.println(Arrays.toString(sum));
	}
}
