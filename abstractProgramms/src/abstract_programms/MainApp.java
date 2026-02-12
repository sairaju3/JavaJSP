package abstract_programms;

public class MainApp 
{
	public static void main(String[] args) 
	{
		UpiPayment upi = new UpiPayment();
		upi.pay(100);
		System.out.println("------------------");
		DebitCard dp = new DebitCard();
		dp.pay(200);
	}
}
