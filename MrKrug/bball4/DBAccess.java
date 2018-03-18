package bballDB;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;

/***************************************************
 * Basketball book keeping system...
 * Objects:
 *    DB - Database Interface (SQLite)
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

 public class DBAccess
 {
    public DBConnect DBConn = null;

    public DBAccess(){
      ballDEBUG bdBUG = new ballDEBUG();
      bdBUG.debugOff();
      bdBUG.msgPrt("DBAccess creation");      
      // DBConn will now point to an open database.
      DBConn = new DBConnect();
    }

    public DBAccess(DBConnect DBConn){
      this.DBConn = DBConn;
    }

    public DBConnect getConnect(){
	return DBConn;
    }

    public void DBClose(){
      DBConn.commitDB();
      DBConn.closeDB();
    }

    private String DBFix(String recType){
	if(recType.toLowerCase().indexOf("book") > -1){
		return "BOOKS";
	}
        
	if(recType.toLowerCase().indexOf("league") > -1){
                return "LEAGUES";
        }

	return "NONE";
    }

    private String formSelect(String recType_in, int key){
      String sql = "";
      String recType = DBFix(recType_in).toUpperCase();

      if(key < 0){
        sql = "SELECT * FROM " + recType + ";";
        }
      else {
        sql = "SELECT * FROM " + recType + " WHERE ID = " + key + ";";
      }
    return sql;
    }


    /**
     * Note - key can only be an int...
     */
    private String formSelect(String recType_in, String field, int key){
      String sql = "";
      String recType = DBFix(recType_in).toUpperCase();

      sql = "SELECT * FROM " + recType + " WHERE " + field + " = " + key + ";";
      return sql;
    }


    public int getKey(String recType_in, String field, String value)
    {
      Statement stmt = null;
      String sql = "";
      ResultSet rs = null;
      int ky = -1;

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
        return -1;
      }

      sql = "SELECT ID FROM " + recType_in + " WHERE " + field + " = '" + value + "';";
      try {
        stmt = DBConn.getConnection().createStatement();
        rs = stmt.executeQuery(sql);
      } catch ( Exception eS ) {
        System.out.println("Error " + recType_in + " (SELECT):" + sql);
      }

      try {
	System.out.println("IN getKey()... ");
	rs.next();
	System.out.println("next cursor...");
	ky = rs.getInt("ID");
	System.out.println("KEY: " + ky);
      } catch ( Exception eT ){
	System.out.println("Error " + recType_in + " in getKey: " + sql);
      } 
      return ky;
    }


    public ResultSet doSelect(String recType_in, int key)
    {
      Statement stmt = null;
      String sql = "";
      ResultSet rs = null;

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
	return null;
      }

      sql = formSelect(recType, key);
      try {
        stmt = DBConn.getConnection().createStatement();
        rs = stmt.executeQuery(sql);
	return rs;
      } catch ( Exception eS ) {
        System.out.println("Error " + recType_in + " (SELECT): " + sql);
      }
      return rs;
    }

 
    public ResultSet doSelect(String recType_in, String field, int key)
    {
      Statement stmt = null;
      String sql = "";
      ResultSet rs = null;

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
        return null;
      }

      sql = formSelect(recType, field, key);
      try {
        stmt = DBConn.getConnection().createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
      } catch ( Exception eS ) {
        System.out.println("Error " + recType_in + " (SELECT): " + sql);
      }
      return rs;
    }
 
    public void doDelete(String recType_in, int key)
    {
      Statement stmt = null;
      String sql = "";
      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
	System.out.println("Coding Error: record type: " + recType_in);
      }
      try {
        stmt = DBConn.getConnection().createStatement();
        sql = "DELETE FROM " + recType + 
                       " WHERE ID = " + key + ";";
        stmt.executeUpdate(sql);
        stmt.close();
      } catch ( Exception e ) {
        System.out.println("Error Books");
      }
    }

}
