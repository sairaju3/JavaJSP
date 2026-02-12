package advanceProgram1;

import java.util.Arrays;

public class ReplaceGreatestElement 
{
	public static void greatestElement(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1; j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[j];
				}
			}
		}
		arr[arr.length-1]=-1;	
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,4,7,5,1,6,3};
		//int[] arr= {9,8,7,6,5,4};
		System.out.println(Arrays.toString(arr));
		greatestElement(arr);
		System.out.println(Arrays.toString(arr));
	}
}
