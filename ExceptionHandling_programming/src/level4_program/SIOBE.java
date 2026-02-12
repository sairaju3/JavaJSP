	package level4_program;
	
	import java.util.Scanner;
	
	public class SIOBE 
	{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String s = new String("SAI RAJU");
			System.out.println("Enter the index to get character");
			int index=sc.nextInt();
			while(true)
			{
			try {
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Enter the Valid index ");
				index=sc.nextInt();
		
			}
			}
					
			
		}
	}
