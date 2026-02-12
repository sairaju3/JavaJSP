package logicalNumberPrograms;
import java.util.Scanner;
public class EvilNumberOrNot 
{
	
	public static int binary(int num)
	{
		int place=1;
		int binary=0;
		int count=0;
		while(num>0)
		{
			
			int rem=num%2;
			if(rem==1)
			{
				count++;
			}
			binary=binary+(rem+place);
			place=place*10;
			num=num/2;
		}
		return count;
	}
	public static void check(int num)
	{
		
		int count=binary(num);
		if(count%2==0)
		{
			System.out.println(num+" is Evil Number..."+"["+count+"]");
		}
		else
		{
			System.out.println(num+" is Not a Evil Number..");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		String bs = Integer.toBinaryString(num);
		System.out.println("Binary form "+bs);

		check(num);
	}
}
// String bs = Integier.toBinaryString(num);