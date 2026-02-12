package expense_track_project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ExpenseManager 
{
	ArrayList<Expense> expense = new ArrayList<Expense>();
	PriorityQueue<Expense> maxPQ = null;
	PriorityQueue<Expense> minPQ = null;
	
	public ExpenseManager()
	{
		maxPQ= new PriorityQueue<>((a , b)-> Double.compare(b.getAmount(),a.getAmount()));
		minPQ = new PriorityQueue<>(Comparator.comparing(Expense :: getAmount));
	}
	
	public void addExpense(Expense e)
	{
		expense.add(e);
		maxPQ.add(e);
		minPQ.add(e);
	}
	public void viewAllExpense()
	{
		if(expense.isEmpty())
			System.out.println("No Expenses");
		else
		{
//			for(int i=0;i<=expense.size();i++)
//			{
//				System.out.println(e);
//			}
			for(Expense e : expense)
			{
				System.out.println(e);
			}
		}
	}
	public void viewByCategory(String category)
	{
		for(Expense e : expense)
		{
			if(e.getCategory().equals(category))
			{
				System.out.println(e);
				break;
			}
		}
	}
	public void viewByMonth(int month, int year)
	{
		
	}
	public double getToatal()
	{
		double sum=0;
		for(Expense e : expense)
		{
			sum=sum+e.getAmount();
		}
		return sum;
	}
	public Expense getHighestExpense()
	{
		return maxPQ.peek();
	}
	public Expense getLowestExpense()
	{
		return minPQ.peek();
	}
}
