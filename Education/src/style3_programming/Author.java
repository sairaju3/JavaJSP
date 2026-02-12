package style3_programming;

public class Author 
{
	public static String publisher = "Vinayaka Enterprizes";
	public String name;
	public int age ;
	public int noOfBooks;
	public String latestBook;
	
	public Author(String name,int age , int noOfBooks , String latestBook)
	{
		this.name=name;
		this.age=age;
		this.noOfBooks=noOfBooks;
		this.latestBook=latestBook;
	}
	public void display()
	{
		System.out.println("Published by "+publisher);
		System.out.println("Author Name : "+name);
		System.out.println("Number of Books "+noOfBooks);
		System.out.println("Age : "+age);
		System.out.println("Latest Book : "+latestBook);
	}
	public static void main(String[] args)
	{
		Author author1=new Author("Nani ",33,23,"loveStory");
		Author author2 = new Author("Sai",39,4,"amma");
		author1.display();
		System.out.println("----------------------------");
		author2.display();
	}
	
}

