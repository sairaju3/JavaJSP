package splite_Array_Elements;


public class SplitArray 
{
	public static void printElements(int[] arr) 
	{
		System.out.print("[");
		for (int i = 0; i <= arr.length - 1; i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}
	
	public static void splitingArray(int [] a)
	{
		int firstArraySize = 0;
		int secondArraySize = 0;
		
		
		if(a.length%2==0)
		{
			firstArraySize= a.length/2;
			secondArraySize = firstArraySize;
		}
		else
		{
			firstArraySize= a.length/2+1;
			secondArraySize = a.length-firstArraySize;
		}
		
		int [] subArray1 = new int[firstArraySize];
		int [] subArray2 = new int[secondArraySize];
		
		for(int i =0 ;i<=subArray1.length-1;i++)
		{
			subArray1[i] = a[i];
		}
		
		System.out.println("Fisrt Sub Array");
		printElements(subArray1);
		
		int index = subArray1.length;
		for(int i = 0;i<=subArray2.length-1;i++)
		{
			subArray2[i]= a[index++];
		}
		System.out.println("Second Sub Array");
		printElements(subArray2);
	}
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5,6,7};
		System.out.println("Given Array...");
		printElements(a);
		splitingArray(a);
			
	}
}
