package functional_interface_programs;

public class MainClass2 
{
	public static void main(String[] args) {
		
		Sample s =(int a,int b)->
		{
			System.out.println(a+b);
			System.out.println(a/b);
		};
		s.add(10, 3);
	}
	
	
}
