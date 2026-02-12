package advanceProgarms;

import java.util.Arrays;
import java.util.Scanner;

public class AdvanceProgram1 
{
	static Scanner sc = new Scanner(System.in);
	public static int[] elementsInput(int size)
	{
		int [] arr = new int[size];
		System.out.println("Enter The Elements one-by-one....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Element for index..");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void ascendingOrder(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void decendingOrder(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static int[] merge(int[] sb1,int[] sb2)
	{
		int [] mergedArray = new int[sb1.length+sb2.length];
		for(int i=0;i<=sb1.length-1;i++)
		{
			mergedArray[i]=sb1[i];
		}
		int index=sb1.length;
		for(int i=0;i<=sb2.length-1;i++)
		{
			mergedArray[index++]=sb2[i];
		}
		return mergedArray;
	}
	public static int[] splitSortAndMerge(int[] arr)
	{
		int firstArraySize = 0;
		int secondArraySize = 0;
		
		
		if(arr.length%2==0)
		{
			firstArraySize= arr.length/2;
			secondArraySize = firstArraySize;
		}
		else
		{
			firstArraySize= arr.length/2+1;
			secondArraySize = arr.length-firstArraySize;
		}
		int [] subArray1 = new int[firstArraySize];
		int [] subArray2 = new int[secondArraySize];
		
		for(int i =0 ;i<=subArray1.length-1;i++)
		{
			subArray1[i] = arr[i];
		}
		
		int index = subArray1.length;
		for(int i = 0; i<=subArray2.length-1; i++)
		{
			subArray2[i]= arr[index++];
		}
		System.out.println("First sub Array : "+Arrays.toString(subArray1));
		System.out.println("Second Sub Array : "+Arrays.toString(subArray2));
	
		decendingOrder(subArray1);
		ascendingOrder(subArray2);
		System.out.println("Decending Order : "+Arrays.toString(subArray1));
		System.out.println("Ascending Order : "+Arrays.toString(subArray2));
		
		int[] mergeArray =merge(subArray1, subArray2);
		System.out.println("Merged Array : "+Arrays.toString(mergeArray));
		return mergeArray;
	}
	public static void leftRotateElements(int[] a,int n)
	{
		for(int j=1;j<=n;j++)
		{
		int temp=a[0];
		for(int i=0;i<=a.length-2;i++) 
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		}
		
	}
	public static void rightRotateElements(int[] a,int n)
	{
		for(int j=1;j<=n;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>=1;i--) 
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the Array ..");
		int size= sc.nextInt();
		int[] arr = elementsInput(size);
		System.out.println(Arrays.toString(arr));
		
		int[] mergedArray = splitSortAndMerge(arr);
		System.out.println("Do yoy want to perform the Rotation ? Y/N ");
		char ch=sc.next().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			System.out.println("Choos the type of Rotattion ");
			System.out.println("1.LEFT Rotation");
			System.out.println("2.RIGHT Rotation");
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter how many rotation");
				int n=sc.nextInt();
				leftRotateElements(mergedArray,n);
				
				System.out.println("After Left Rotation "+n+" times..");
				System.out.println(Arrays.toString(mergedArray));
			}
			else if(choice==2)
			{
				System.out.println("Enter how amny rotation");
				int n=sc.nextInt();
				rightRotateElements(mergedArray,n);
				System.out.println("After Right Rotation "+n+" times..");
				System.out.println(Arrays.toString(mergedArray));
			}
			else
			{
				System.out.println("Invalid Choice..");
			}
		}
		else
		{
			System.out.println("Thank U...😎😎😎.....");
		}
		
	}
}
