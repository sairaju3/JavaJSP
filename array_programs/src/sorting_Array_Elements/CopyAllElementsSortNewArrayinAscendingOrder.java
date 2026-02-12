package sorting_Array_Elements;

public class CopyAllElementsSortNewArrayinAscendingOrder 
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
	public static int[] copyElements(int[] arr , int [] newArr)
	{
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				newArr[index++]=arr[i];
			}
		}
		return newArr;
	}
	public static int count(int [] arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		return count;
		
	}
	public static void sortnewArray(int [] a)
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
	public static void main(String[] args) {
		
		int[] arr = {2,1,3,5,6,4};
		int[] newArray = new int[count(arr)];
		copyElements(arr, newArray);
		sortnewArray(newArray);
		printElements(newArray);
	}
}
