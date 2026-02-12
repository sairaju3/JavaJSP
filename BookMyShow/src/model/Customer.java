package model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User 
{
	private String id;
	List<String> bookingIds = new ArrayList<>();
	
	
	public Customer(String id,String username, String password) {
		super(username, password);
		this.id=id;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	
	
	
	
}
