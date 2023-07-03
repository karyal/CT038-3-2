package week11;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER="root";
		String PASS="Nepal@123";
		String DBNAME="oodjb";
		int PORT=3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		
		try {
			Class.forName(DRIVER); //Load Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			conn.close();
			System.out.println("Connect with db successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}