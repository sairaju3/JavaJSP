package encapuslationProgramms;

public class AccountMainApp 
{
	public static void main(String[] args) 
	{
		Account account1=new Account("Sai Raju",291294538,"Saving",23998.5);
	
		account1.deposite(20000);
		account1.withdraw(2000);
		account1.showBalance();
		System.out.println("----------------------------");
		Account account2=new Account("Manohar",291234538,"Saving",50998.5);
		account2.deposite(30000);
		account2.withdraw(40000);
		account2.showBalance();
	}
	
}
