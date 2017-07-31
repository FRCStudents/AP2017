package bballDB;

import bballUtil.ballDEBUG;

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

public class DBConnect
 {
   public Connection conn = null;

   public Connection getConnection(){
     if (this.conn == null){
       this.openDB();
     }
     return this.conn;
   }

   public Connection openDB()
   {
     ballDEBUG bdBUG = new ballDEBUG();
     //bdBUG.debugOn();
     bdBUG.msgPrt("Opening DB connection");
     try {
       Class.forName("org.sqlite.JDBC");
       bdBUG.msgPrt("set up JDB");
       this.conn = DriverManager.getConnection("jdbc:sqlite:bball.db");
       bdBUG.msgPrt("got connection...");
     } catch ( Exception e ) {
       bdBUG.msgPrt("crash and burn");
       System.exit(0);
     }
     return this.conn;
   }

   public void commitDB(){
     try {
       this.conn.commit();
     } catch ( Exception e ) {
       System.exit(0);
     }
   }

   public void closeDB(){
     try {
       this.conn.close();
     } catch ( Exception e ) {
       System.exit(0);
     }
   }
}
