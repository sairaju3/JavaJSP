package race_multiThread_des;

public class UserThread extends Thread
{
	BankAccount account;
	
	public UserThread(BankAccount account) 
	{
		this.account=account;
	}
	@Override
	public void run() 
	{
		account.withdraw(500);
	}
}
