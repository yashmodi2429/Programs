package com.Dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.emp.model.*;
import com.emp.Dao.interf.*;
import com.emp.db.*;

public class Daoimplementation implements EmployeeDAO{
	public Pojo p = new Pojo();
	private static PreparedStatement pst=null;
	public static Connection con=DBUtil.createConnection();
	public int addEmployee(Pojo p ) {
		int employeeAdded =0;
		try {
			
			
			int employeeId = p.getEmployeeId();
			String employeeName= p.getEmployeeName();
			System.out.println(con);
			pst=con.prepareStatement("insert into employeetbl(id,name) values (?,?)");
			pst.setInt(1, employeeId);
			pst.setString(2, employeeName);
			employeeAdded =pst.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return employeeAdded;
		
	}
		
}
