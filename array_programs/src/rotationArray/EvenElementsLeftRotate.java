package rotationArray;

import java.util.Scanner;

public class EvenElementsLeftRotate 
{
	public static void printElements(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]+" ");
			else
				System.out.print(arr[i]+",");
			
		}
		System.out.println("]");
	}
	public static int countEvenElements(int[] a ) 
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				count++;
		}
		return count;
	}
	public static int[] evenElemnets(int[] a,int[] newArray )
	{
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				newArray[index++]=a[i];
			}
		}
		return newArray;
	}
	public static void leftRatate(int[] a)
	{
		int temp=a[0];
		for(int i=0;i<=a.length-2;i++) 
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of the Elements...");
		int n= sc.nextInt();
		int [] a= {2,3,6,8,9,1};
		int count=countEvenElements(a);
		int[] newArray = new int[count]; 
		evenElemnets(a, newArray);
		for(int i=1;i<=n;i++)
		{
			leftRatate(newArray);
			System.out.println("After "+i+" left rotation ");
			printElements(newArray);
		}
	}
}
