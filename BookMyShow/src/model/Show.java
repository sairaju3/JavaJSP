package model;

import java.time.LocalDateTime;

public class Show 
{
	private  String id = "";
	private  Movie movie = null;
	private  Theatre theatre = null;
	private  LocalDateTime time = null;
	private  int totalSeats = 0;
	private int availableSeats;
	public Show(String id, Movie movie, Theatre theatre, LocalDateTime time, int totalSeats ,int availableSeats) {
		
		this.id = id;
		this.movie = movie;
		this.theatre = theatre;
		this.time = time;
		this.totalSeats = totalSeats;
		this.availableSeats=availableSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	
	public boolean bookSeats(int numberOfSeats)
	{
		if(numberOfSeats<=0)
			return false;
		if(availableSeats>=numberOfSeats)
		{
			availableSeats-=numberOfSeats;
			return true;
		}
		return false;
	}
	
	
	public void cancleSeats(int numberOfSeats)
	{
		if(numberOfSeats<=0)
			return;
		availableSeats+=numberOfSeats;
		if(availableSeats>totalSeats)
			availableSeats=totalSeats;
	}
	

	@Override
	public String toString() {
		return "Show [id=" + id + ", movie=" + movie + ", theatre=" + theatre + ", time=" + time + ", totalSeats="
				+ totalSeats + "]";
	}

	
}
