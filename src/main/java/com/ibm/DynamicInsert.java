package com.ibm;
 
  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
  
public class DynamicInsert {

	public static void main(String[] args) {
		
		try
		{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/jdbc_example";
			String username="root";
			String password="1234";
			
			Class.forName(driver);
			
			Connection conn= DriverManager.getConnection(url,username,password);
			String insertquery="insert into emp(name,salary) value (?,?)";
			PreparedStatement ptst=conn.prepareStatement(insertquery);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
//			System.out.println("enter id : ");
//			int id=br.read();
			
			System.out.println("enter name : ");
			String name=br.readLine();
			
			System.out.println("enter slary : ");
			String salary=br.readLine();
			
//			ptst.setInt(1, id);
			ptst.setString(1, name);
			ptst.setString(2, salary);
			
			ptst.executeUpdate();
			System.out.println("inserted");
			conn.close();
			
		}
		
		catch (Exception e) {
		e.printStackTrace();
		}
		
		finally {
			
		}
}
}
