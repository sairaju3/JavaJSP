package race_multiThread_des;

public class BankAccount 
{
	int balance=2000;
	public void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("Available Balance :- "+balance);
	}
	
}
