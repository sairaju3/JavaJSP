package equalsMethod_programs;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("Amma Dairy lo Konni pagelu ..","Ravi", 200, 80);
		Book b2 = new Book("Harry potters","Nani", 1000, 200);
		Book b3 = new Book("Love Story","Sai", 100, 150);
		
		String book1=b1.toString();
		String book3=b3.toString();
		
		System.out.println(book1);
		System.out.println("---------------");
		System.out.println(book3);
		
		System.out.println(b2.equales(b3));
		
		
	}
}
