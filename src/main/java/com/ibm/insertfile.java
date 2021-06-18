package com.ibm;

import java.sql.PreparedStatement;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class insertfile {

	public static void main(String[] args) {
		
		try {
			String driver="com.mysql.cj.jdbc.Driver";

		String url="jdbc:mysql://localho"
		
		//F:\eclipse-jee-2021-03-R-win32-x86_64\eclipse\JDBC\src\resources\textfile.txt
		
		PreparedStatement ps=con.preparedStatement("insert into filedb values(?,>)");
		
		File f=new File("F:\eclipse-jee-2021-03-R-win32-x86_64\eclipse\JDBC\src\resources\textfile.txt");
		FileReader fr=new FileReader(f);
		ps.setInt(1,103);
		}

	}

}
