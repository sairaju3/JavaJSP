package practice;

public class MainApp 
{
	public static void main(String[] args) 
	{
		int amount =2000;
		String product=" 'your order of "+amount+" has been placed successfully' ";
		Payment p = new Upi();
		p.pay(amount);
		
		Message m = new Email();
			m.send(product);
		m=new SMS();
		m.send(" 'Your order is on the way!' ");
		
	}
}
