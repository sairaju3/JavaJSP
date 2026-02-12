package rotate_String;
import java.util.Scanner;
public class RightRotate
{
	
		public static char[] toCharArray(String st)
		{
			char[] ch =new char[st.length()];
			for(int i=0;i<=st.length()-1;i++)
			{
				ch[i]=st.charAt(i);
			}
			return ch;
		}
		public static char[] rightRotate(char[] ch)
		{
			
			char temp=ch[ch.length-1];
			for(int i=ch.length-1;i>=1;i--)
			{
				ch[i]=ch[i-1];
			}
			ch[0]=temp;
			return ch;
		}
		public static String toString(char[] ch)
		{
			String st="";
			for(int i=0;i<=ch.length-1;i++)
			{
				st+=ch[i];
			}
			return st;
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String..");
			String st=sc.next();
			
			char[] ch =toCharArray(st);
			rightRotate(ch);
			
			String res=toString(ch);
			System.out.println(res);
			
		
		}
	

}
