package com.org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testdb {
	private static final String URL="jdbc:mysql://localhost:3306/DB1";
	private static final String USER="root";
	private static final String PASS="Root123$";
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASS);
	}
	public static void main(String[] args)
	{
		try(Connection connection=getConnection())
		{
			if(connection!=null)
			{
				System.out.println("Connected to db");
				Statement st=connection.createStatement();
				ResultSet rs=st.executeQuery("select * from Student");
				while(rs.next())
					{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
					
					}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
