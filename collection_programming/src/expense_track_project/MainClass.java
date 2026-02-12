package expense_track_project;

import java.time.LocalDate;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ExpenseManager manager = new ExpenseManager();
		Scanner sc = new Scanner(System.in);
		int idCount=1;
		
		while(true) 
		{
			System.out.println("1.Add Expense");
			System.out.println("2.View All Expenses");
			System.out.println("3.View By Category");
			System.out.println("4.View By Month");
			System.out.println("5.Get Total Expenses");
			System.out.println("6.Get Higest Expense");
			System.out.println("7.Get Lowest Expense");
			System.out.println("8.Exit");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1: 
			{
				System.out.println("Add Amount");
				double amount=sc.nextDouble();
				
				System.out.println("Add Category");
				String category=sc.next();
				
				System.out.println("Add Date");
				LocalDate date= LocalDate.parse(sc.next());
				
				System.out.println("Add note");
				String note = sc.next();
				
				Expense e =new Expense(idCount++ , amount,category,date,note);
				manager.addExpense(e);
				System.out.println("Expense add Sucesfully");
			}
			break;
			case 2:
			{
				manager.viewAllExpense();
			}
			break;
			case 3:
			{
				System.out.println("Enter Category...");
				String categery =sc.next();
				manager.viewByCategory(categery);
			}
			break;
			case 4:
			{
				
			}
			break;
			case 5:
			{
				manager.getToatal();
				
			}break;
			case 6:
			{
				manager.getHighestExpense();
			}break;
			case 7:
			{
				manager.getLowestExpense();
				
			}break;
			case 8:
			{
				System.exit(0);
			}break;
			default:
				System.out.println("Enter Valid Choice...");
			}
		}
		
	}
}
