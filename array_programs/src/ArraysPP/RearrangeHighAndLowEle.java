package ArraysPP;

import java.util.Arrays;

public class RearrangeHighAndLowEle 
{
	public static void check(int[] arr)
	{
		
		int [] newArr=new int[arr.length];
		int low=0;
		int high=arr.length-1;
		int index=0;
		while(low<=high)
		{
			if(index<arr.length)
				newArr[index++]=arr[low++];
			if(index<arr.length)
				newArr[index++]=arr[high--];
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) 
	{
		int[] arr= {3,4,5,6};
		check(arr);
	}
}
