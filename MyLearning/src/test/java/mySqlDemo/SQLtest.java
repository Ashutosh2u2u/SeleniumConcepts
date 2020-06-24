package mySqlDemo;

public class SQLtest {

	public static void main(String[] args) 
	{
		ConnectSQLDB.connectMySqlDB("localhost", "3306", "Sample", "root", "root");
	}

}
