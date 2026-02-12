/* num=19
   1^2  9^2
   1       81
 	   82
   8^2    2^2
   	64     4
   		68
   	6^2    8^2
   	36       64
   	    100
   	   1+0+0
   	      1 is a happy number.*/



package advanceLevelPrograms;

import java.util.Scanner;

public class HappyNumberorNot 
{
	public static int digit(int num)
	{
		int sum=0;
		int square=0;
		while(num>0)
		{
			int ld=num%10;
			square=ld*ld;
			sum=sum+square;
			num=num/10;
		}
		return sum;
	}
	public static void square(int num)
	{
		while(true)
		{
			int sum=digit(num);
			if(sum==1 || sum==4)
			{
				if(sum==1)
				{
					System.out.println(sum+" is Happy number..");
				}
				else {
					System.out.println(sum+" is unHappy");
				}
				break;
			}
			else
			{
			num=sum;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
//		square(19);
		square(num);
	}
}
