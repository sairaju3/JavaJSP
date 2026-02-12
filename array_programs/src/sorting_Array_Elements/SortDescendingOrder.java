package sorting_Array_Elements;

public class SortDescendingOrder 
{
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("]");
	}
	public static void sortAnArray(int[] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		}
	}
	public static void main(String[] args) 
	{
		int [] a= {2,5,1,7,3};
		System.out.println("Before Sorting...");
		printElements(a);
		sortAnArray(a);
		System.out.println("After Sorting...");
		printElements(a);
	
	}
}
