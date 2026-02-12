package functional_interface_programs;

public class MainReverse 
{
	public static void main(String[] args) {
		
		ReverseString r =(String st)->
		{
			String newString="";
			for(int i=0;i<=st.length()-1;i++)
			{
				char ch=st.charAt(i);
				newString=ch+newString;
			}
			System.out.println(newString);
		};
		r.reverse("Nani");
	}
}
