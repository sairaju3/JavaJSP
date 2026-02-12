package multiThreading.com;

public class MainClass 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Bye..");
		}
	}
}
