package org.jsp.loadandregister;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterDriverClass 
{
	public static void main(String[] args) 
	{
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			System.out.println("Driver Class Loaded...");
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
}
