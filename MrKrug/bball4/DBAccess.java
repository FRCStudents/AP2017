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
import java.sql.SQLException;

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
      	ballDEBUG bdBUG = new ballDEBUG();
      	bdBUG.debugOff();
      	bdBUG.msgPrt("DBAccess DBClose... closing the database here");

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

        if(recType.toLowerCase().indexOf("game") > -1){
                return "GAMES";
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

      DBConn.startDBCall();

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
	
	DBConn.endDBCall();

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
        ballDEBUG bdBUG = new ballDEBUG();
        bdBUG.debugOff();
        bdBUG.msgPrt("DBAccess getKey... closing the database here");
	rs.next();
	ky = rs.getInt("ID");
      } catch ( Exception eT ){
	System.out.println("Error " + recType_in + " in getKey: " + sql);
      } 

      DBConn.endDBCall();

      return ky;
    }


    public ResultSet doSelect(String recType_in, int key)
    {
      Statement stmt = null;
      String sql = "";
      ResultSet rs = null;

      DBConn.startDBCall();

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
	return null;
      }

      sql = formSelect(recType, key);
      try {
        ballDEBUG bdBUG = new ballDEBUG();
        bdBUG.debugOff();
        bdBUG.msgPrt("DBAccess doSelect... closing the database here");

        stmt = DBConn.getConnection().createStatement();
        rs = stmt.executeQuery(sql);

	//DBConn.endDBCall();

	return rs;
      } catch ( Exception eS ) {
        System.out.println("Error " + recType_in + " (SELECT): " + sql);
      }

      //DBConn.endDBCall();

      return rs;
    }

 
    public ResultSet doSelect(String recType_in, String field, int key)
    {
      Statement stmt = null;
      String sql = "";
      ResultSet rs = null;

      DBConn.startDBCall();

      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);

        DBConn.endDBCall();

        return null;
      }

      sql = formSelect(recType, field, key);
      try {
        ballDEBUG bdBUG = new ballDEBUG();
        bdBUG.debugOff();
        bdBUG.msgPrt("DBAccess doSelect(2)... closing the database here");

        stmt = DBConn.getConnection().createStatement();
        rs = stmt.executeQuery(sql);

        //DBConn.endDBCall();

        return rs;
      } catch ( Exception eS ) {
        System.out.println("Error " + recType_in + " (SELECT): " + sql);
      }

      //DBConn.endDBCall();

      return rs;
    }

    private String buildSQL(String recType_in, String[] fields){
	String sql = "";
	System.out.println(recType_in + ":" + fields[0]);
        if(recType_in.equals("BOOKS")){
                sql = "INSERT INTO BOOKS " +
                         "(NAME) VALUES ('" + fields[0] + "')";
                }
        if(recType_in.equals("LEAGUES")){
		int parentId = getKey("BOOKS", "NAME", fields[1]);
                sql = "INSERT INTO LEAGUES " +
                        "(NAME, BOOK_ID) VALUES ('" + fields[0] + "'," + parentId + ")";
                }

        if(recType_in.equals("GAMES")){
		int parentId = getKey("LEAGUES", "NAME", fields[3]);
                sql = "INSERT INTO GAMES " +
                   "(TEAM_1, TEAM_2, GAME_DATE, LEAGUE_ID) VALUES ('" + fields[0] + "','" + fields[1] + "','" + fields[2] + "'," + parentId + ")";
                }
	System.out.println(sql);
	return sql;
    }

    public void doAdd(String recType_in, String[] fields) 
    {
      Statement stmt = null;
      String sql = ""; 
      String recType = DBFix(recType_in);
      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
      }
      try {
        ballDEBUG bdBUG = new ballDEBUG();
        bdBUG.debugOff();
        bdBUG.msgPrt("DBAccess doAdd()... closing the database here");

        stmt = DBConn.getConnection().createStatement();
        sql = buildSQL(recType_in, fields); 
        stmt.executeUpdate(sql);
        stmt.close();

	DBConn.endDBCall();

      } catch ( SQLException e ) {
        System.out.println(sql);
        System.out.println(e.getMessage());
        System.out.println("Error " + recType_in);
      }
  
    }

    private String buildUPTSQL(String recType_in, String[] fields){
        String sql = "";
        System.out.println(recType_in + ":" + fields[0]);
        if(recType_in.equals("BOOKS")){
             	sql = "UPDATE BOOKS WHERE ID = " + fields[0] + " SET NAME = " +
                         "'" + fields[1] + "';";
                }
        if(recType_in.equals("LEAGUES")){
                int parentId = getKey("BOOKS", "NAME", fields[0]);
		int newBookId = getKey("BOOKS", "NAME", fields[2]);
		int leagueId = getKey("LEAGUES", "NAME", fields[4]); 
                sql = "UPDATE LEAGUES SET NAME = '" +
                     fields[3] + "', BOOK_ID = " + newBookId + " WHERE ID = " + leagueId + " AND BOOK_ID = " + parentId + "; ";
                }

        if(recType_in.equals("GAMES")){
                int parentId = getKey("LEAGUES", "NAME", fields[3]);
                sql = "UPDATE GAMES WHERE ID = " + fields[0] + " SET TEAM_1 = '" + fields[1] + "', TEAM_2 = '" + 
			fields[2] + "', GAME_DATE = '" + fields[3] + "', LEAGUE_ID = " + parentId + ";"; 
                }
        System.out.println(sql);
        return sql;
    }

    public void doChange(String recType_in, String[] fields)
    {
      Statement stmt = null;
      String sql = "";
      String recType = DBFix(recType_in);

      DBConn.startDBCall();

      if(recType.equals("NONE")){
        System.out.println("Coding Error: record type: " + recType_in);
      }
      try {
        stmt = DBConn.getConnection().createStatement();
        sql = buildUPTSQL(recType_in, fields);
        stmt.executeUpdate(sql);
        stmt.close();

        DBConn.endDBCall();

      } catch ( SQLException e ) {
        System.out.println(sql);
        System.out.println(e.getMessage());
        System.out.println("Error " + recType_in);
      }

    }

 
    public void doDelete(String recType_in, int key)
    {
      Statement stmt = null;
      String sql = "";
      String recType = DBFix(recType_in);

      DBConn.startDBCall();

      if(recType.equals("NONE")){
	System.out.println("Coding Error: record type: " + recType_in);
      }
      try {
        ballDEBUG bdBUG = new ballDEBUG();
        bdBUG.debugOff();
        bdBUG.msgPrt("DBAccess doDelete... closing the database here");

        stmt = DBConn.getConnection().createStatement();
        sql = "DELETE FROM " + recType + 
                       " WHERE ID = " + key + ";";
        stmt.executeUpdate(sql);
        stmt.close();

	DBConn.endDBCall();

      } catch ( SQLException e ) {
	System.out.println(sql);
	System.out.println(e.getMessage());
        System.out.println("Error " + recType_in);
      }
    }

}
