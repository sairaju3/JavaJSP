package custom_exception;

import java.util.Scanner;


public class Login 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The UserName...");
		String userName=sc.next();
		System.out.println("Enter the Password");
		int password=sc.nextInt();
		if(userName.equals("Nani"))
		{
			if(password==123)
			{
				System.out.println("Login Successful...");
			}
			else
			{
				InvalidPasswordCustomException p = new InvalidPasswordCustomException();
				throw p;
			}
		}
		else
		{
			UserNameMisMatch u = new UserNameMisMatch();
			throw u;
		}
	
	} 
	
}
