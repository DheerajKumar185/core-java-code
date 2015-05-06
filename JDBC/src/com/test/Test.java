package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		String status="";
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver is Loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			//System.out.println("Connection is Created");
			ps = con.prepareStatement("SELECT * FROM detail");
			rs = ps.executeQuery();
			boolean found = rs.next();
			if(found)
			{
				String userid=rs.getString("userid");
				String username=rs.getString("username");
				System.out.println("user_Id : " + userid);
				System.out.println("user_Name : " + username);
				status = "Welcome !!! " + username;
			}
			else
			{
				System.out.println("Invalid UserName or Password");
				status = "Invalid UserName or Password";
			}
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}