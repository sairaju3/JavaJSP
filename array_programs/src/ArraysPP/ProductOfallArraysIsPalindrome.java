package ArraysPP;

public class ProductOfallArraysIsPalindrome 
{
	public static boolean checkPalindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev==temp;
	}
	public static void productAllElements(int[] arr)
	{
		int product=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			product=product*arr[i];
		}
		System.out.println("Product of elements: " + product);
		if(checkPalindrome(product))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	public static void main(String[] args) 
	{
		int[] arr= {11,11};
		productAllElements(arr);
		
	}
}
