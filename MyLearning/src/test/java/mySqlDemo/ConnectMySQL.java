package mySqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySQL {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//com.mysql.cj.jdbc.Driver
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
		System.out.println("Connected to mysql db");
		//for executing the sql queries
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from Training");
		//next will look foreward for last available entries
		while(rs.next())
		{
			String name=rs.getString("name");
			String course=rs.getString("course");
			System.out.println("Name of Trainner " +name+  " |&|" + " Course " + course );
		}

	}

}

