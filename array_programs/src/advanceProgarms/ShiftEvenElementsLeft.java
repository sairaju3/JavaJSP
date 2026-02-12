package advanceProgarms;

import java.util.Arrays;

public class ShiftEvenElementsLeft 
{
	public static void leftRotate(int[] arr,int index)
	{
		int temp =arr[index];
		for(int i=index;i<=arr.length-2;i++)
		{
			arr[i]=arr[i+1];	
		}
		arr[arr.length-1]=temp;
		
	}
	
	public static void shiftZeros(int[] arr)
	{
		for(int j=0;j<=arr.length-1;j++)
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				int ele=arr[i];
				if(ele%2==0)
				{
					leftRotate(arr, i);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int [] arr= {1,4,5,3,2,8};
		System.out.println(Arrays.toString(arr));
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
	}	
}
