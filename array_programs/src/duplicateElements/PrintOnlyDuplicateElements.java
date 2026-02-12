package duplicateElements;

import java.util.Arrays;

public class PrintOnlyDuplicateElements 
{
	public static void printDuplicate(int[] arr)
	{
		boolean condn=true;
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited)
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=visited;
						condn=false;
					}
				}
				if(count>1)
					System.out.println(arr[i]);
			}
		}
		if(condn)
			System.out.println("No Duplicate Elements...");
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,1,1};
		System.out.println(Arrays.toString(arr));
		printDuplicate(arr);
	}
}
