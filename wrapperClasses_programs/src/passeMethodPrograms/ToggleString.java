package passeMethodPrograms;

public class ToggleString 
{
	public static void toggle(String s)
	{
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				s1=s1+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				s1=s1+Character.toUpperCase(ch);
			}
					
		}
		System.out.println(s1);;
	}
	public static void main(String[] args) {
		String s="aBcD";
		toggle(s);
	}
}
