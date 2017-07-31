package bballDB;

import bball.BBooks;
import bball.League;
import bball.Team;
import bball.TeamStat;
import bball.Game;
import bball.GameStat;
import bball.Player;
import bball.PlayerStat;

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

/**************************************************
 * BBooks - table
 **************************************************/
 public class DBDelete
 {
    public DBConnect DBConn = null;
    public Connection conn = null;

    public DBDelete(){
      this.DBConn = new DBConnect();
      this.conn = DBConn.getConnection();
    }

    public DBDelete(DBConnect DBConn){
      this.DBConn = DBConn;
      this.conn = DBConn.getConnection();
    }

    public DBDelete(Connection c){
      this.conn = c;
    }

    public void DBClose(){
      this.DBConn.commitDB();
      this.DBConn.closeDB();
    }

    public void doBooksDelete(int key)
    {
      Statement stmt = null;
      String sql = "";
      try {
        stmt = this.conn.createStatement();
        sql = "DELETE FROM BOOKS " +
                       " WHERE ID = " + key + ";";
        System.out.println(sql);
        stmt.executeUpdate(sql);
        stmt.close();
      } catch ( Exception e ) {
        System.out.println("Error Books");
      }
    }

   public void doLeaguesDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM LEAGUES " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Leagues");
     }
   }

   public void doGamesDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM GAMES " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Games");
     }
   }


   public void doGameStatsDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM GAME_STATS " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error GameStats");
     }
   }


   public void doTeamsDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM TEAMS " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Teams");
     }
   }


   public void doTeamStatsDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM TEAM_STATS " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Leagues");
     }
   }


   public void doPlayersDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM PLAYERS " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error Players");
     }
   }


   public void doPlayerStatsDelete(int key)
   {
     Statement stmt = null;
     String sql = "";
     try {
       stmt = this.conn.createStatement();
       sql = "DELETE FROM PLAYER_STATS " +
                      " WHERE ID = " + key + ";";
       System.out.println(sql);
       stmt.executeUpdate(sql);
       stmt.close();
     } catch ( Exception e ) {
       System.out.println("Error PlayerStats");
     }
   }

}
