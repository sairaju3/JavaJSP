package race_multiThread_des;

public class MainClass 
{
	public static void main(String[] args) {
		
		BankAccount account1=new BankAccount();
		
		UserThread t1 = new UserThread(account1);
		UserThread t2 = new UserThread(account1);
		
		t1.start();
		t2.start();
	}
}
