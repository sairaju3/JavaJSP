package abstract_programms;

public class UpiPayment extends Payment
{

	@Override
	public void pay(int amount) 
	{
		System.out.println(amount+" is paid through UPI...");
	}

}
