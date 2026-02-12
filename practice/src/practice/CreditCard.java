package practice;

public  class CreditCard extends Payment {

	@Override
	public void pay(int ccard) {
		System.out.println("Paid "+ccard+" using Credit Card");
		
	}

		
}

