package model;

public class Theatre 
{

	private String theatreName;
	private String location;
	private String id;
	
	public Theatre(String theatreName, String location, String id) 
	{	
		this.theatreName = theatreName;
		this.location = location;
		this.id = id;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName)
	{
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Theatre [theatreName=" + theatreName + ", location=" + location + ", id=" + id + "]";
	}
	
}
