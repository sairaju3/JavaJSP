package rotationArray;

import java.util.Scanner;

public class RightNTimesRoatation 
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
	public static void leftRotateElements(int[] a)
	{
		int temp=a[a.length-1];
		for(int i=a.length-1;i>=1;i--) 
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Rotations times..");
		int n= sc.nextInt();
		int[] a= {2,3,4,5,6};
		System.out.println("Before Rotation");
		printElements(a);
		
		leftRotateElements(a);
		System.out.println("After Rotation..");
		printElements(a);
		
		
		for(int i=1;i<=n;i++)
		{
			leftRotateElements(a);
			System.out.println("After "+i+" left Rotation");
			printElements(a);

		}
		
	}
}
