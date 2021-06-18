package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JDBCDemo {
		
		static final String JDBC_Driver ="com.mysql.cj.jdbc.Driver";
		static final String DB_URL="jdbc:mysql://localhost:3306/world";
		
		static final String USERNAME= "root";
		static final String PASSWORD= "1234";
		

		public static void main(String[] args) throws SQLException {
		
			JDBCDemo jdbcDemo= new JDBCDemo();
			jdbcDemo.getCityInformation();
		}

			private void getCityInformation() throws SQLException
			{
				Connection connection=null;
				java.sql.Statement stmt=null;
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					
				System.out.println("connecting to database");
				
				connection =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				
				stmt=connection.createStatement();
				
				String sql="select ID,Name,CountryCode,District, Population from city where id<21";
				
				ResultSet rs=stmt.executeQuery(sql);
				
				while(rs.next())
				{
					int id=rs.getInt("ID");
					String name=rs.getString("Name");
					String countryCode=rs.getString("District");
					String district=rs.getString("District");
					int population=rs.getInt("Population");
					
						
					System.out.println("ID: " +id);
					System.out.println(",Name: " +name);
					System.out.println(",CountryCode: " +countryCode);
					System.out.println("District: " +district);
					System.out.println("Population: " +population);
				}
			}
				catch (SQLException se) {
					se.printStackTrace();
					}
				catch (ClassNotFoundException se) {
					se.printStackTrace();
					}
				finally
				{
					connection.close();
				}
			}
	}


