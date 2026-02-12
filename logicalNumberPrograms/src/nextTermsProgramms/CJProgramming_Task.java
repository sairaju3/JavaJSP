package nextTermsProgramms;

import java.util.Scanner;

/* num     = 23571
 * reverse = 17532 (not palindrome)
 * 
 *         17532
 *         23571
 *         
 *         41103
 *         30114
 *         
 *         71217  (palimdrome)
 *         
 *         spilt into half
 *         
 *         712 17    (712+17)
 *           729
 *            72 9
 *              81
 *              8 1
 *               9
 *               
 *               print(single digit)
 *  
 *  */

public class CJProgramming_Task 
{
	public static int countDigits(int num)
	{
		int count = 0;
		while(num>0)
		{
			num = num /10;
			count++;
		}
		return count;
	}
	public static int reverseNumber (int num)
	{
		int reverse =0;
		while ( num > 0 )
		{
			int ld =  num % 10;
			reverse = (reverse * 10)+ ld;
			num = num/10;
		}
		return reverse;
	}
	
	public static boolean checkPalindrome(int num)
	{
		int reverse = reverseNumber(num);
		return num == reverse;
	}
	
	public static int spiltNumberAndSum(int num)
	{
		int count = countDigits(num);
		int div = 1;
		for(int i = 1;i<=count/2;i++)
		{
			div = div * 10;
		}
		int second = num % div;
		int first = num / div;
		
		return first + second;
	}
	
	public static int generatePalindrome(int num)
	{
		if (checkPalindrome(num))
			return num;
		else
		{
			while(true)
			{
				int rev = reverseNumber(num);
				num = num + rev;
				if (checkPalindrome(num))
					break;
			}
			System.out.println("palindrome : "+num);
			return num;
		}
	}
	
	public static void advanceNumberCheck(int num)
	{
		if (num>9)
		{
//			if(checkPalindrome(num))
//			{
			num = generatePalindrome(num);
				while(true)
				{
					num = spiltNumberAndSum(num);
					if(num<=9)
					{
						break;
					}
					System.out.println(num);
				}
				System.out.println("Single digit Sum is "+num);
//			}
		}
		else
		{
			System.out.println("Single digit"+num);
		}
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();

		advanceNumberCheck(num);
	}
	
	
}