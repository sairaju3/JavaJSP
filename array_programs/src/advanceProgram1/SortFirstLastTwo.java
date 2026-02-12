package advanceProgram1;

public class SortFirstLastTwo 
{
    public static void main(String[] args) 
    {
        int[] arr = {9, 5, 3, 8, 6, 2, 7, 1};
        printElements(arr);
        int[] sort= sortfirstandlastTwo(arr);
		printElements(sort);	
	}
	public static int[] sortfirstandlastTwo(int[] arr)
	{
		//sort first two
		if (arr[0] > arr[1]) 
		{
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

	  //sort last two
		int n = arr.length;
		if (arr[n-2] > arr[n-1]) 
		{
			int temp = arr[n-2];
			arr[n-2] = arr[n-1];
			arr[n-1] = temp;
		}
		return arr;
	}
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}	
}
