package duplicateElements;

import java.util.Arrays;

public class RemovePrimeDuplicates
{
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static int removeDuplicatePrime(int[] arr)
	{
		int count=0;
		int visited = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited && checkPrime(arr[i]))
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=visited;
						count++;
					}
				}
			}
		}
		return count;
	}
	public static int[] copyNonDuplicateElements(int[] arr)
	{
		int visited=Integer.MIN_VALUE;
		int count = removeDuplicatePrime(arr);
		int[] newArr = new int[arr.length-count]; 
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited)
			{
				newArr[index++]=arr[i]; 
			}
		}
		return newArr;
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,5,2,9,5,2,1,7,13};
		System.out.println(Arrays.toString(arr));
		removeDuplicatePrime(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyNonDuplicateElements(arr)));
	}
}
