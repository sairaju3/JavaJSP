package string_PP;

public class SubStringPalindrome 
{
	public static boolean isPalindrome(String st)
	{
		String rev="";
		for(int i=0;i<=st.length()-1;i++)
		{
			rev=st.charAt(i)+rev;
		}
		return st.equalsIgnoreCase(rev);
	}
	public static void subString(String st)
	{
		for(int i=0;i<=st.length()-1;i++)
		{
			String sub=""+st.charAt(i);
			for(int j=i+1;j<=st.length()-1;j++)
			{
				 sub=sub+st.charAt(j);
				if(isPalindrome(sub))
				{
					System.out.println(sub);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		String st="Markram";
		//String st="malayalam";
		subString(st);
	}
}
