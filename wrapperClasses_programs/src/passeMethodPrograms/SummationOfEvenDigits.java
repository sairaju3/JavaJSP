package passeMethodPrograms;

public class SummationOfEvenDigits 
{
	public static void summationOfEven(String s)
	{
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				s1=s1+ch;
			}
		}
		int num=Integer.parseInt(s1);
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int ld =temp%10;
			if(ld%2==0)
			{
				sum=sum+ld;
			}
			temp=temp/10;
		}	
		System.out.println(sum);
	}
	public static void main(String[] args) {
		String s="J12sp34";
		summationOfEven(s);
	}
}
