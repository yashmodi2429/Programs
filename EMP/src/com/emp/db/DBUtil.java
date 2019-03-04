package com.emp.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection createConnection()
	{
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee/?user=root&password=yash");
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		return con;
	}
}
