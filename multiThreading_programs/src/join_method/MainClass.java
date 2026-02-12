package join_method;

public class MainClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyThread2());
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
