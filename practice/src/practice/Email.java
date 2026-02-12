package practice;

public class Email extends Message
{

	@Override
	public void send(String emailmessage) {
		System.out.println("Email send "+emailmessage);
		
	}

}
