package daemon_thread;

public class MainClass 
{
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		
		t1.start();
		t1.setDaemon(true);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("I m Main Thread");
		}
	}
}
