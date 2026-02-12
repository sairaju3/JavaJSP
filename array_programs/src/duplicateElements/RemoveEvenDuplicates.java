package duplicateElements;

import java.util.Arrays;

public class RemoveEvenDuplicates 
{
	public static int evenDuplicate(int[] arr)
	{
		int count=0;
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited && arr[i]%2==0)
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j] && arr[j]%2==0)
					{
						arr[j]=visited;
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void copyNonDuplicateElements(int[] arr)
	{
		int visited=Integer.MIN_VALUE;
		int count = evenDuplicate(arr);
		if(count==0)
		{
			System.out.println("No Even Duplicate Elements");
		}
		else
		{
			int[] newArr = new int[arr.length-count]; 
			int index=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]!=visited)
				{
					newArr[index++]=arr[i]; 
				}
			}
			System.out.println(Arrays.toString(newArr));
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,3,5,1,2,4,6,1,5,4};
		System.out.println(Arrays.toString(arr));
		copyNonDuplicateElements(arr);
	}
}
