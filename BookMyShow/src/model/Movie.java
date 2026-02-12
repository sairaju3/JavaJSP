package model;

public class Movie 
{
	private String title;
	private String genre;
	private String id;
	private int duration;
	
	public Movie(String title, String genre, String id, int duration) 
	{
		this.title = title;
		this.genre = genre;
		this.id = id;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", id=" + id + ", duration=" + duration + "]";
	}
	
	
	
	
	
}
