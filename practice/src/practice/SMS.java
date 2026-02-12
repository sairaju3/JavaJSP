package practice;

public class SMS extends Message
{

	@Override
	public void send(String smsmessage) {
		System.out.println("SMS send"+smsmessage);
		
	}
	
}
