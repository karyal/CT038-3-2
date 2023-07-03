package week11;

import java.sql.Connection; //Ctrl + Shift + O
import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
				
		try {
			Class.forName(DRIVER); //1. Loading driver class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Database Server Connect Successfully");
			conn.close();
			System.out.println("Close Connection Successfully");
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}