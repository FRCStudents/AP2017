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
        bbDEBUG.debugOn();
        DBConn = new DBConnect();
      }

      public DBTransInsert(DBConnect DBConn){
        bbDEBUG.debugOn();
        this.DBConn = DBConn;
      }

      public DBConnect getDBConn(){
        return DBConn;
      }

      public int doInsert(String tbl, String name, int parentId){
	int r = 0;
	if(tbl.equals("BOOKS")){
          	String sql = "INSERT INTO BOOKS " +
                         "(NAME) VALUES ('" + name + "')";
          	r = doDBInsert(sql, name);
		}
        if(tbl.equals("LEAGUES")){
                String sql = "INSERT INTO LEAGUES " +
                        "(NAME, BOOK_ID) VALUES ('" + name + "'," + parentId + ")";
                r = doDBInsert(sql, name);
                }

 	return (r >= 0 ? r: -1);
      }

      public int doDBInsert(String sql, String bName)
      {
        Statement stmt = null;
        int lastKey = 0;
        try {
          stmt = DBConn.getConnection().createStatement();
          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
	  System.out.println("Crash & Burn: " + sql);
	  return -1;
        }

        // return key of the record we just inserted
        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error (insert id): " + sql);
		 return -1;
             }

        return lastKey;
      }

}
