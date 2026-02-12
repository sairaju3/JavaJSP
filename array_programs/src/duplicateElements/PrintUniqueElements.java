package duplicateElements;

import java.util.Arrays;

public class PrintUniqueElements 
{
	public static void printUnique(int[] arr)
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
						
					}
				}
				if(count==1)
				{
					System.out.println(arr[i]);
					condn=false;
				}
			}
		}
		if(condn)
			System.out.println("No Unique Elements");
	}
	public static void main(String[] args) 
	{
		//int[] arr = {1,2,1,2,3,2,3};
		int [] arr ={1,1,2,2,3,3,5,8};
		System.out.println(Arrays.toString(arr));
		printUnique(arr);
	}
}
