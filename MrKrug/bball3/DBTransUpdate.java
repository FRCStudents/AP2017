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
 public class DBTransUpdate
 {
      public Connection conn = null;
      public DBConnect DBConn = null;
      public ballDEBUG bbDEBUG = new ballDEBUG();

      public DBTransUpdate(){
        bbDEBUG.debugOff();
        this.DBConn = new DBConnect();
        this.conn = DBConn.getConnection();
      }

      public DBTransUpdate(DBConnect DBConn){
        bbDEBUG.debugOff();
        this.DBConn = DBConn;
        this.conn = DBConn.getConnection();
      }

      public DBTransUpdate(Connection c){
        bbDEBUG.debugOff();
        this.conn = c;
      }

      public DBConnect getDBConn(){
        return this.DBConn;
      }

      public int doBooksUpdate(BBooks book){
          String name = book.getName();
          int id = book.getId();
          return this.doBooksUpdate(id, name);
      }

      public int doBooksUpdate(int id, String bName)
      {
        Statement stmt = null;
        String sql = "";
        int lastKey = 0;
        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE BOOKS " +
                         "SET NAME = '" + bName + "' WHERE ID = " + id;

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.exit(0);
        }

        return id;
      }

      public int doLeaguesUpdate(League league){
        return this.doLeaguesUpdate(league.getId(), league.getName());
      }

      public int doLeaguesUpdate(int id, String name)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE LEAGUES " +
                         "SET NAME = '" + name + "'  WHERE id = " + id;

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Leagues");
        }

         return id;

      }


      public int doGamesUpdate(Game gm){
          return this.doGamesUpdate(gm.getId(), gm.getTeamName1(), gm.getTeamName2(), gm.getGameDate(), gm.getLeague());
      }

      public int doGamesUpdate(int id, String team1, String team2, String dt, int league)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE GAMES " +
                         "SET TEAM_1 = '" + team1 + "' AND TEAM_2 = '" + team2 +
                         "' AND GAME_DATE = '" + dt + "' AND LEAGUE_ID = " + league +
                         " WHERE id = " + id + ";";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
        } catch ( Exception e ) {
          System.out.println("Error Games");
        }

        return id;
      }

      public int doGameStatsUpdate(GameStat gameStat){
        return this.doGameStatsUpdate(gameStat.getId(),
                                      gameStat.getStatName(),
                                      gameStat.getStatValue(),
                                      gameStat.getGameID());
      }

      public int doGameStatsUpdate(int id, String statName, float statVal, int game)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE INTO GAME_STATS " +
                         " SET STAT_NAME = '" + statName +
                         "' AND STAT_VALUE = '" + statVal +
                         "' AND GAME_ID = " + game +
                         " WHERE ID = " + id + ";";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error GameStats");
        }

         return id;

      }

      public  int doTeamsUpdate(int id, Team team){
        return this.doTeamsUpdate(team.getId(), team.getName(), team.getSchool(), team.getNotes());
      }

      public int doTeamsUpdate(int id, String name, String school, String notes)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE TEAMS " +
                         " SET NAME = '" + name +
                         "' AND SCHOOL = '" + school +
                         "' AND NOTES = '" + notes +
                         "' WHERE id = " + id + ";";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Teams");
        }

         return id;

      }


      public int doTeamStatsUpdate(TeamStat ts){
          return this.doTeamStatsUpdate(ts.getId(), ts.getStatName(), ts.getStatValue(), ts.getTeamID());
      }

      public int doTeamStatsUpdate(int id, String statName, float statValue, int teamID)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE TEAM_STATS " +
                         " SET STAT_NAME = '" + statName + "' AND STAT_VALUE = '" +
                         statValue + "' AND TEAM_ID = " + teamID +
                         " WHERE ID = " + id + ";";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Leagues");
        }

         return id;

      }


      public int doPlayersUpdate(Player player){
        return this.doPlayersUpdate(player.getId(), player.getName(), player.getPlayerTeamID(),
                             player.getPlayerNumber(), player.getPlayerHeight(),
                             player.getPlayerNotes());
      }

      public int doPlayersUpdate(int id, String name, int teamID, int number, float height, String txt)
      {
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "UPDATE PLAYERS " +
                         "SET NAME = '" + name +
                         "' AND TEAM_ID = " + teamID +
                         " AND NUMBER = " + number +
                         " AND HEIGHT = " + height +
                         " AND NOTES = '" + txt +
                         "' WHERE ID = " + id + ";";

          bbDEBUG.msgPrt(sql);
          stmt.executeUpdate(sql);
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Players");
        }

         return id;
      }


        public int doPlayerStatsUpdate(PlayerStat ps){
            return this.doPlayerStatsUpdate(ps.getId(), ps.getStatName(), ps.getStatValue(), ps.getPlayerID());
        }

         public int doPlayerStatsUpdate(int id, String statName, float statValue, int playerID)
         {
           Statement stmt = null;
           String sql = "";

           try {
             stmt = this.conn.createStatement();
             sql = "UPDATE INTO PLAYER_STATS " +
                            "SET STAT_NAME = '" + statName +
                            "' AND STAT_VALUE = '" + statValue +
                            "' AND PLAYER_ID = " + playerID +
                            " WHERE ID = " + id + ";";

             bbDEBUG.msgPrt(sql);
             stmt.executeUpdate(sql);
             stmt.close();
           } catch ( Exception e ) {
             System.out.println("Error PlayerStats");
           }

            return id;

         }

}
