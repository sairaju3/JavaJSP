package encapuslationProgramms;
import java.io.Serializable;
public class Account implements Serializable
{
	private String accountHolder;
	private int accountNumber;
	private String accountType;
	private double accountBalance;
	
	public Account()
	{
		
	}

	public Account(String accountHolder, int accountNumber, String accountType, double accountBalance) {
	
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public boolean validateHolderName(String accountHolder)
	{
		if()
	}
	public boolean validateAccountNumber(int accountNumber)
	{
		int count=0;
		while(accountNumber>0)
		{
			accountNumber=accountNumber/10;
			count++;
		}
		if(count==9) 
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Account Number");
			return false;
		}
	}
	public boolean validateAccountType(String accountType)
	{
		if(accountType.equals("Saving")|| accountType.equals("Current"))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Account Type");
			return false;
		}
	}
	public boolean validateAccountBalance(double accountBalance)
	{
		if(accountBalance>=0)
		{
			return true;
		}
		else
		{
			System.out.println("Insuficent Balance");
			return false;
		}
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposite(double amount)
	{
		if(amount>0)
		{
			accountBalance=accountBalance+amount;
			System.out.println("Deposit "+amount);
		}
		else
		{
			System.out.println("Deposit amount must be positive");
		}
		
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=accountBalance)
		{
			accountBalance=accountBalance-amount;
			System.out.println("Withdraw : "+amount);
		}
		else if(amount>accountBalance)
		{
			System.out.println("Insufficent balance");
		}
		else
		{
			System.out.println("Withdrow amount must be positive");
		}
	}
	public void showBalance()
	{
		System.out.println("Account Holder Name : "+getAccountHolder());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Account Type : "+getAccountType());
		System.out.println("Current Balance : "+getAccountBalance());
	}
}
