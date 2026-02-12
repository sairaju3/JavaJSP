package doubleColOpertion;

public class Demo 
{
	public static String toUpperCase(String st)
	{
		char[] ch=st.toCharArray();
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			char c=ch[i];
			if(c>='a' && c<='z')
			{
				c =(char)(c-32);
			}
			res=res+c;
		}
		return res;
	}
	
}
