package advanceProgarms;

import java.util.Arrays;

public class LasgestAndSamllestInThirdArray 
{
	public static int fingSmallestElement(int[] arr)
	{
		int smallest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		return smallest;
	}
	public static int fingLargestElement(int[] arr)
	{
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
	public static int[] merging(int a[],int b[])
	{
		int[] c=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		int index=a.length;
		for(int i=0;i<=b.length-1;i++)
		{
			c[index++]=b[i];
		}
		return c;
	}
	public static int[] combain(int[] a)
	{
		int[] res=new int[2];
		res[0]=fingLargestElement(a);
		res[1]=fingSmallestElement(a);
		return res;
		
	}
	public static void main(String[] args) 
	{
		int[] a= {10,5,6,8}; 
		int[] b= {4,5,7,9};
		int[] c=merging(a, b);
		System.out.println(Arrays.toString(c));
		
		System.out.println(Arrays.toString(combain(c)));
	}
	
}
