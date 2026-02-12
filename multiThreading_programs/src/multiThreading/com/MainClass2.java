package multiThreading.com;

public class MainClass2 
{
	public static void main(String[] args) {
		
		Runnable r = new MyThread3();
		
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
