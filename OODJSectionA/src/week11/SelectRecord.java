package week11;

import java.sql.Connection; //Ctrl + Shift + O
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectRecord {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql = "SELECT * FROM tbl_persons";
		try {
			Class.forName(DRIVER); //1. Loading driver class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();//Run SQL
			while(rs.next()) {//if record found
				System.out.println(rs.getInt("pid")+", "+rs.getString("fullname")+", "+rs.getString("address"));
			}
			conn.close();
			System.out.println("Records Displayed");
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}