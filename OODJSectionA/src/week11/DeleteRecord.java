package week11;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql = "DELETE FROM tbl_persons WHERE pid=1";
		try {
			Class.forName(DRIVER); //1. Loading driver class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.executeUpdate();//Run SQL
			conn.close();
			System.out.println("Record Deleted");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}