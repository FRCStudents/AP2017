package bballDB;

import bballUtil.ballDEBUG;

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

public class DBConnect
 {
   public Connection conn = null;

   public DBConnect(){
	conn = openDB();
   }

   public Connection getConnection(){
     if (conn == null){
       openDB();
     }
     return this.conn;
   }

   public Connection openDB()
   {
     ballDEBUG bdBUG = new ballDEBUG();
     bdBUG.debugOff();
     bdBUG.msgPrt("Opening DB connection");
     try {
       Class.forName("org.sqlite.JDBC");
       bdBUG.msgPrt("set up JDB");
       this.conn = DriverManager.getConnection("jdbc:sqlite:bball.db");
       bdBUG.msgPrt("got connection..." + this.conn);
     } catch ( Exception e ) {
       bdBUG.msgPrt("crash and burn");
       System.exit(0);
     }
     return this.conn;
   }

   public void commitDB(){
     ballDEBUG bdBUG = new ballDEBUG();
     bdBUG.debugOff();
     try {
       conn.commit();
     } catch ( Exception e ) {
       bdBUG.msgPrt("commit: Crash & Burn");
       System.exit(0);
     }
   }

   public void closeDB(){
     ballDEBUG bdBUG = new ballDEBUG();
     bdBUG.debugOff();
     try {
       conn.close();
     } catch ( Exception e ) {
       bdBUG.msgPrt("close: Crash & Burn");
       System.exit(0);
     }
   }
}
