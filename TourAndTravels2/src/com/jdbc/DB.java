package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static void main(String[] args) {
		DB.getConnect();
	}
	
	public static Connection getConnect()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "grandtour", "grandtour");
			System.out.println("Connected");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}return conn;
	}

}
