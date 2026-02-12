package org.jsp;

import java.io.Serializable;

public class Hr  implements Serializable
{
	private String name;
	private String email;
	private String password;
	private long number;
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public long getNumber() {
		return number;
	}
	
}
