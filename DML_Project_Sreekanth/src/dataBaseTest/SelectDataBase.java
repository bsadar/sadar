package dataBaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataBase {
	public String select_db(String query) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://192.168.84.77;integratedSecurity=true;databaseName=databasename";
		String user = "DML\\sreekath.bandi";
		String pass = "";
		String abc="";
		String query_field[]=query.split("-");
		System.out.println("Query is :"+query_field[0]);
		System.out.println("Field is :"+query_field[1]);
		Connection conn = DriverManager.getConnection(dbURL,user,pass);
		if (conn != null) {
			System.out.println("Connected");
		}
		else
		{
			System.out.println("Not Connected");
		}
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query_field[0]);
		while(rs.next())
		{
			abc=rs.getString(query_field[1]);
		}
		return abc;
	}
}
