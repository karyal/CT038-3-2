package week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER="root";
		String PASS="Nepal@123";
		String DBNAME="oodjb";
		int PORT=3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql ="insert into tbl_persons values(2, 'Shambhu', 'Ktm')";
		try {
			Class.forName(DRIVER); //Load Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.executeUpdate();
			conn.close();
			System.out.println("Record inserted");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
}