	package level5_program;
	
	import java.util.Scanner;
	
	public class SIOBE 
	{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String s = new String("SAI RAJU");
			System.out.println("Enter the index to get character");
			int index=sc.nextInt();
			int chance=0;
			while(true)
			{
				try 
				{
					System.out.println(s.charAt(index));
					break;
				}
				catch(StringIndexOutOfBoundsException e)
				{
					if(chance==3)
					{
						System.out.println("Sorry your chances are reached ");
						break;
					}
				System.out.println("you have "+(3-chance)+" chances");
				System.out.println("Enter the Valid index ");
				index=sc.nextInt();
				chance++;
		
				}
			}
					
			
		}
	}
