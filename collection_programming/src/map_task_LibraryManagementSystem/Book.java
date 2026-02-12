package map_task_LibraryManagementSystem;

public class Book 
{
	private int bookId;
	private String bookName;
	private String authorName;
	private double bookPrice;
	private int noOfPages;
	
	public Book(String bookName, String authorName, double bookPrice, int noOfPages) {
	
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.noOfPages = noOfPages;
	}

	
	
	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public double getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}



	public int getNoOfPages() {
		return noOfPages;
	}



	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}



	@Override
	public String toString() {
		return "LibraryManagementSystem [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ ", noOfPages=" + noOfPages + "]";
	}
	
}
