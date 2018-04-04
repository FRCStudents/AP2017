import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

class DBTryGo {
        private Connection conn = null;
        //private ResultSet rs = null;
        private Statement stmt = null;
	int c = 0;
 	public ResultSet doit(){
		ResultSet rs = null;
	     	try {
       			Class.forName("org.sqlite.JDBC");
       			conn = DriverManager.getConnection("jdbc:sqlite:bball.db");
  		} catch ( Exception e ) {
       			System.out.println("Crash");
     	 	}


      		String sql = "SELECT * FROM BOOKS;"; 
      		System.out.println(sql);
      		try {
        		stmt = conn.createStatement();
        		rs = stmt.executeQuery(sql);
			while(rs.next() && c < 4){
				System.out.println("First fetch (" + c + ")");
				c++;
			}
		} catch (Exception e){
			System.out.println("Burn");
		}
		return rs;
	}

	public void printIt(ResultSet rs){
		try {
			System.out.println("try to cursor");
			//rs.first();
			while(rs.next()){
				System.out.println("In next");
                		int id = rs.getInt("ID");
                		String name = rs.getString("NAME");
                		System.out.println("====> " + name);	
              		}
            	} catch ( Exception eN ) {
              		System.out.println("Error RecordSet **Books (cursor next)");
            	}
	}
}

public class DBTry {
	public static void main(String[] argv){
		DBTryGo dbt = new DBTryGo();
		dbt.printIt(dbt.doit());
  	}
}	
