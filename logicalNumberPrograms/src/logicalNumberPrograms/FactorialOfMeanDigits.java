package logicalNumberPrograms;
import java.util.Scanner;
public class FactorialOfMeanDigits 
{
	public static int factorial(int num)
	{
			int fact =1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
		return fact;
	}
	public static void factorialOfmeandigits(int num)
	{
		int lastdigit=num%10;
		num=num/10;
		while(num>9)
		{
			int ld=num%10;
			int fact = factorial(ld);
			System.out.println("Factorial of "+ld+" = "+fact);
			num=num/10;
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		factorialOfmeandigits(num);
	}
}
