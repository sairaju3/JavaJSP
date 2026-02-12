package model;

public abstract class User {
    String username;
    String password; 

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    { 
    	return username;
    }
    public boolean checkPassword(String attempt)
    { 
    	return password.equals(attempt); 
    }
}

