package bballDB;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

 public class DBTransInsert
 {
      public DBConnect DBConn = null;
      public ballDEBUG bbDEBUG = new ballDEBUG();

      public DBTransInsert(){
        bbDEBUG.debugOff();
        DBConn = new DBConnect();
      }

      public DBTransInsert(DBConnect DBConn){
        bbDEBUG.debugOff();
        this.DBConn = DBConn;
      }

      public DBConnect getDBConn(){
        return DBConn;
      }

      public int doInsert(String tbl, String name){
	int r = 0;
	if(tbl.equals("BOOKS"))
          	r = doBooksInsert(name);
 	return (r >= 0 ? r: -1);
      }

      public int doBooksInsert(String bName)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;
        try {
          stmt = DBConn.getConnection().createStatement();
          sql = "INSERT INTO BOOKS " +
                         "(NAME) VALUES ('" + bName + "')";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
	  System.out.println("Crash & Burn: " + sql);
          System.exit(0);
        }

        try {
          stmt = DBConn.getConnection().createStatement();
          sql = "SELECT COUNT(*) AS CNT	 FROM BOOKS;"; 

          bbDEBUG.msgPrt(sql);
          ResultSet rs = stmt.executeQuery(sql);
	  rs.next();
	  int i = rs.getInt("CNT");
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Crash & Burn: " + sql);
          System.exit(0);
        }

        // return key of the record we just inserted
        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error BOOKS (insert id)");
             }

        return lastKey;
      }

}
