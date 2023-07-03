package week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyDatabase {
	
	public boolean insertRecord() {
		boolean result=false;
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql = "INSERT INTO tbl_persons VALUES(3, 'Keshor','Ktm')";
		try {
			Class.forName(DRIVER); //1. Loading driver class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.executeUpdate();//Run SQL
			conn.close();
			System.out.println("Record Inserted");
			result=true;
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	public boolean updateRecord() {
		boolean result=false;
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql = "UPDATE tbl_persons SET fullname='Binod Kr Basyal', address='Kathmandu' WHERE pid=1";
		try {
			Class.forName(DRIVER); //1. Loading driver class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.executeUpdate();//Run SQL
			conn.close();
			System.out.println("Record Updated");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	public boolean deleteRecord() {
		boolean result=false;
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
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	public void searchRecord() {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Nepal@123";
		String DBNAME = "oodja";
		int PORT = 3306;
		String URL = "jdbc:mysql://localhost:"+PORT+"/"+DBNAME;
		String sql = "SELECT * FROM tbl_persons WHERE pid=1";
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
	public void allRecords() {
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