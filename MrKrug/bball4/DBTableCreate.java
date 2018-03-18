package bballDB;

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

 public class DBTableCreate extends DBConnect
 {
   public void doBooksTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";
     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE BOOKS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " NAME TEXT NOT NULL)";
         msg = "Table Books Created";
        }
       else{
         sql = "DROP TABLE BOOKS;";
         msg = "Table Books Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       //stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Books");
       System.exit(0);
     }
   }


   public void doLeaguesTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE LEAGUES " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " NAME           TEXT    NOT NULL," +
		      " BOOK_ID		INT    NOT NULL)";
         msg = "Table Leagues Created";
                    }
       else{
         sql = "DROP TABLE LEAGUES;";
         msg = "Table Books Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Leagues");
     }
   }

   /*********************************************
    * DATE - FORMAT ("yyyy-mm-dd")
    *********************************************/

   public void doGamesTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE GAMES " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " TEAM_1         TEXT    NOT NULL," +
                      " TEAM_2         TEXT    NOT NULL," +
                      " GAME_DATE      DATETIME," +
                      " LEAGUE_ID      INT     NOT NULL" +
                      ")";
          msg = "Table Games Created";
          }
       else{
         sql = "DROP TABLE GAMES;";
         msg = "Table Games Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Games");
     }
   }


   public void doGameStatsTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE GAME_STATS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " STAT_NAME      TEXT    NOT NULL," +
                      " STAT_VALUE     FLOAT   NOT NULL," +
                      " GAME_ID        INT     NOT NULL" +
                      ")";
         msg = "Table GameStats Created";
                    }
       else{
         sql = "DROP TABLE GAME_STATS;";
         msg = "Table Games Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error GameStats");
     }
   }



   public void doTeamsTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE TEAMS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " NAME           TEXT    NOT NULL," +
                      " SCHOOL         TEXT    NOT NULL," +
                      " NOTES          TEXT" +
                      ")";
         msg = "Table Teams Created";
                    }
       else{
         sql = "DROP TABLE TEAMS;";
         msg = "Table Teams Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Teams");
     }
   }


   public void doTeamStatsTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE TEAM_STATS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " STAT_NAME      TEXT    NOT NULL," +
                      " STAT_VALUE     FLOAT   NOT NULL," +
                      " TEAM_ID        INT     NOT NULL" +
                      ")";
         msg = "Table TeamStats Created";
                    }
       else{
         sql = "DROP TABLE TEAM_STATS;";
         msg = "Table TeamStats Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error TeamStats");
     }
   }



   public void doPlayersTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE PLAYERS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " NAME           TEXT    NOT NULL," +
                      " TEAM_ID        INT     NOT NULL," +
                      " NUMBER         INT     NOT NULL," +
                      " HEIGHT         FLOAT   NOT NULL," +
                      " NOTES          TEXT" +
                      ")";
          msg = "Table Players Created";
                    }
       else{
         msg = "Table TeamStats Dropped";
         sql = "DROP TABLE PLAYERS;";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Stats");
     }
   }


   public void doPlayerStatsTable(int CreateDrop)
   {
     Statement stmt = null;
     String sql = "";
     String msg = "";

     try {
       stmt = this.conn.createStatement();
       if(CreateDrop > 0){
         sql = "CREATE TABLE PLAYER_STATS " +
                      "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                      " STAT_NAME TEXT    NOT NULL," +
                      " STAT_VALUE FLOAT   NOT NULL," +
                      " PLAYER_ID  INT     NOT NULL" +
                      ")";
         msg = "Table PlayerStats Created";
                    }
       else{
         sql = "DROP TABLE PLAYER_STATS;";
         msg = "Table PlayerStats Dropped";
       }

       System.out.println(msg);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error PlayerStats");
     }
   }


   public void createDatabase(){
      this.doBooksTable(1);
      this.doLeaguesTable(1);
      this.doGamesTable(1);
      this.doGameStatsTable(1);
      this.doTeamsTable(1);
      this.doTeamStatsTable(1);
      this.doPlayersTable(1);
      this.doPlayerStatsTable(1);
   }

   public void dropDatabase(){
      this.doBooksTable(0);
      this.doLeaguesTable(0);
      this.doGamesTable(0);
      this.doGameStatsTable(0);
      this.doTeamsTable(0);
      this.doTeamStatsTable(0);
      this.doPlayersTable(0);
      this.doPlayerStatsTable(0);
   }


}
