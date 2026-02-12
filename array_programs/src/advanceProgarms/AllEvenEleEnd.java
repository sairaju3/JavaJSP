package advanceProgarms;


import java.util.Arrays;

public class AllEvenEleEnd
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
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			int ele=arr[i];
//			if(ele==0)
//			{
//				leftRotate(arr, i);
//			}
//		}
		int size=arr.length;
		for(int i=0;i<=size-1;i++)
		{
			int ele=arr[i];
			if(ele%2==0)
			{
				leftRotate(arr, i);
				size--;
				i--;
			}	
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,1,0,4,0,5,9,2};
	//	int [] arr= {0,1,0,0,0,0,0,4,0,0,0,5,3,0};
		System.out.println(Arrays.toString(arr));
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}

