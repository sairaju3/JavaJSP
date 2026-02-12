package hashSet;

import java.util.Objects;

public class MovieTicket 
{
	private int ticketNo;
	private String movieName;
	private String theater;
	private String language;
	private double price;
	private String seatNo;
	public MovieTicket(int ticketNo, String movieName, String theater, String language, double price, String seatNo) {
		
		this.ticketNo = ticketNo;
		this.movieName = movieName;
		this.theater = theater;
		this.language = language;
		this.price = price;
		this.seatNo = seatNo;
	}
	
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	
	@Override
	public int hashCode() {
		return this.ticketNo;
	}
	@Override
	public String toString() {
		return "MovieTicket [ticketNo=" + ticketNo + ", movieName=" + movieName + ", theater=" + theater + ", language="
				+ language + ", price=" + price + ", seatNo=" + seatNo + "]";
	}
}
