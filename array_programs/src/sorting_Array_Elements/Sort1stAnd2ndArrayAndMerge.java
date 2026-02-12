package sorting_Array_Elements;

public class Sort1stAnd2ndArrayAndMerge 
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
	public static void sortAscendind(int[] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void sortDescending(int[] b)
	{
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=i+1;j<=b.length-1;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
	}
	public static int[] mergr(int[] a,int [] b)
	{
		int[] c=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		int index=a.length;
		for(int i=0;i<=b.length-1;i++)
		{
			c[index++]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int [] a= {2,4,6,7,3,10};
		int [] b= {1,3,9,10,5};
		System.out.println("First Array");
		printElements(a);
		sortAscendind(a);
		System.out.println("First Array After Sorting ");
		printElements(a);
		System.out.println("Second Array");
		printElements(b);
		sortDescending(b);
		System.out.println("Second Array After Sorting");
		printElements(b);
		int[] c= mergr(a,b);
		System.out.println("Merging two Sorted Arrays...");
		printElements(c);
		
	}
}
