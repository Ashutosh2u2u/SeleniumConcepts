package mySqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSQLDB {
	
	public static void connectMySqlDB(String host,String port,String dbName, String userName, String password)
	{		
		try
		{
			//Class.forName("com.mysql.jdbc.Driver"); -----depricated
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+ host.trim() + ":"+ port.trim() + "/"+ dbName.trim(), userName.trim(), password.trim());
			System.out.println("connection establised");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
