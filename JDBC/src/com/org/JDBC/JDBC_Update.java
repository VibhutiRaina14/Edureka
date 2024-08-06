package com.org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Update {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection con=null;
		try
		{//1
			Class.forName("com.sql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			//2
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DB1","root","Root123$");
			System.out.println("Connected");
			//3
			PreparedStatement ps=con.prepareStatement("update Student set subj=? where id=?");
			//4
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no. of records that you want to have");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String sname=sc.next();
				System.out.println("Enter fee");
				int fee=sc.nextInt();
				System.out.println("Enter subject");
				String subj=sc.next();
				ps.setInt(1, id);
				ps.setString(2, sname);
				ps.setInt(3, fee);
				ps.setString(4,subj);
				int j=ps.executeUpdate();
				System.out.println(j+" records affected");
			}	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}

