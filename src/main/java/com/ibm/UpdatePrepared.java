package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatePrepared {

	public static void main(String[] args) {
		
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/jdbc_example";
			String username="root";
			String password="1234";
			
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//for update
			PreparedStatement stmt=con.prepareStatement("update emp set ename=? where eid=?");
		stmt.setString(1,"varshini");
		stmt.setInt(2, 101);
		
		int i=stmt.executeUpdate();
		System.out.println(i+"records updated");
		
		//for retrieve
		//PreparedStatement stmt =con.prepareStatement("select * from emp");
		
		//ResultSet.rs=stmt.executeQuery();
		//while(rs.next());
		//{
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		//}
		
		con.close();
		;
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
