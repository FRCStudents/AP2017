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
 *    DBTransfer - moving data between the
 *    database and the memory objects...
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.*;
import java.sql.*;

 /**************************************************
 * BBooks - table
 **************************************************/
 public class DBTransInsert
 {
      public Connection conn = null;
      public DBConnect DBConn = null;
      public ballDEBUG bbDEBUG = new ballDEBUG();

      public DBTransInsert(){
        bbDEBUG.debugOff();
        this.DBConn = new DBConnect();
        this.conn = DBConn.getConnection();
      }

      public DBTransInsert(DBConnect DBConn){
        bbDEBUG.debugOff();
        this.DBConn = DBConn;
        this.conn = DBConn.getConnection();
      }

      public DBTransInsert(Connection c){
        bbDEBUG.debugOff();
        this.conn = c;
      }

      public DBConnect getDBConn(){
        return this.DBConn;
      }

      public int doBooksInsert(BBooks book){
          String name = book.getName();
          return this.doBooksInsert(name);
      }

      public int doBooksInsert(String bName)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;
        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO BOOKS " +
                         "(NAME) VALUES ('" + bName + "')";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
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
                 System.out.println("Error Leagues (insert id)");
             }

        return lastKey;
      }

      public int doLeaguesInsert(League league){
        return this.doLeaguesInsert(league.getName());
      }

      public int doLeaguesInsert(String name)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO LEAGUES " +
                         "(NAME) VALUES ('" + name + "');";
          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Leagues");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Leagues (insert id)");
             }
         return lastKey;

      }


      public int doGamesInsert(Game gm){
          return this.doGamesInsert(gm.getTeamName1(), gm.getTeamName2(), gm.getGameDate(), gm.getLeague());
      }

      public int doGamesInsert(String team1, String team2, String dt, int league)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO GAMES " +
                         "(TEAM_1, TEAM_2, GAME_DATE, LEAGUE_ID) VALUES ('" +
                         team1 + "','" +
                         team2 + "', '" + dt + "', " +
                         league + ");";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          //stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Games");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Games (insert id)");
             }
         return lastKey;
      }

      public int doGameStatsInsert(GameStat gameStat){
        return this.doGameStatsInsert(gameStat.getStatName(),
                                      gameStat.getStatValue(),
                                      gameStat.getGameID());
      }

      public int doGameStatsInsert(String statName, float statVal, int game)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO GAME_STATS " +
                         "(STAT_NAME, STAT_VALUE, GAME_ID) VALUES ('" +
                         statName + "','" +
                         (float)statVal + "', " +
                         game + ");";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error GameStats");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Game_Stats (insert id)");
             }
         return lastKey;

      }

      public  int doTeamsInsert(Team team){
        return this.doTeamsInsert(team.getName(), team.getSchool(), team.getNotes());
      }

      public int doTeamsInsert(String name, String school, String notes)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO TEAMS " +
                         "(NAME, SCHOOL, NOTES) VALUES ('" +
                         name + "','" +
                         school + "', '" +
                         notes + "');";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Teams");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Teams (insert id)");
             }
         return lastKey;

      }


      public int doTeamStatsInsert(TeamStat ts){
          return this.doTeamStatsInsert(ts.getStatName(), ts.getStatValue(), ts.getTeamID());
      }

      public int doTeamStatsInsert(String statName, float statValue, int teamID)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO TEAM_STATS " +
                         "(STAT_NAME, STAT_VALUE, TEAM_ID) VALUES ('" +
                         statName + "', " + (float)statValue + "," + teamID + ");";
          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Leagues");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Team_Stats (insert id)");
             }
         return lastKey;

      }


      public int doPlayersInsert(Player player){
        return this.doPlayersInsert(player.getName(), player.getPlayerTeamID(),
                             player.getPlayerNumber(), player.getPlayerHeight(),
                             player.getPlayerNotes());
      }

      public int doPlayersInsert(String name, int teamID, int number, float height, String txt)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;

        try {
          stmt = this.conn.createStatement();
          sql = "INSERT INTO PLAYERS " +
                         "(NAME, TEAM_ID, NUMBER, HEIGHT, NOTES) VALUES ('" +
                         name + "', " + teamID + "," + number + "," + height + ",'" + txt + "');";
          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Players");
        }

        try {
             ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
             rs.next();
             lastKey = rs.getInt("id");
             rs.close();
             stmt.close();
             } catch ( Exception e ) {
                 System.out.println("Error Players (insert id)");
             }
         return lastKey;
      }


        public int doPlayerStatsInsert(PlayerStat ps){
            return this.doPlayerStatsInsert(ps.getStatName(), ps.getStatValue(), ps.getPlayerID());
        }

         public int doPlayerStatsInsert(String statName, float statValue, int playerID)
         {
           Statement stmt = null;
           String sql = "";
           int lastKey = 0;

           try {
             stmt = this.conn.createStatement();
             sql = "INSERT INTO PLAYER_STATS " +
                            "(STAT_NAME, STAT_VALUE, PLAYER_ID) VALUES ('" +
                            statName + "', " + (float)statValue + "," + playerID + ");";
             bbDEBUG.msgPrt(sql);
             stmt.executeUpdate(sql);
             stmt.close();
           } catch ( Exception e ) {
             System.out.println("Error PlayerStats");
           }

           try {
                ResultSet rs = stmt.executeQuery( "SELECT last_insert_rowid() as id;" );
                rs.next();
                lastKey = rs.getInt("id");
                rs.close();
                stmt.close();
                } catch ( Exception e ) {
                    System.out.println("Error PlayerStats (insert id)");
                }
            return lastKey;

         }

}
