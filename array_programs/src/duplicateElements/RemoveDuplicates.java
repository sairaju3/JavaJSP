package duplicateElements;

import java.util.Arrays;
public class RemoveDuplicates 
{
	public static int removeDuplicates(int[] arr)
	{
		int count=0;
		int visited = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited)
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
		int count = removeDuplicates(arr);
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
		int[]  arr = {1,5,4,1,4,3,6};
		System.out.println(Arrays.toString(arr));
		removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(copyNonDuplicateElements(arr)));
	}
}

// i/p :- arr = [1, 5, 4, 1, 4, 3, 6]
// [o/p :- arr = [1, 5, 4, -2147483648, -2147483648, 3, 6]
