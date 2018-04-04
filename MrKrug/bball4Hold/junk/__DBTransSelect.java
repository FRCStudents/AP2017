package bballDB;

import bball.SubModel;
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
 public class DBTransSelect
 {
       public Connection conn = null;
       public DBConnect DBConn = null;
       public ballDEBUG bdBUG = null;
       public ArrayList<SubModel> subList = null;

       public DBTransSelect(){
         this.bdBUG = new ballDEBUG();
         //this.bdBUG.debugOn();
         //this.bdBUG.msgPrt("in DBTransSelect-1!");

         this.DBConn = new DBConnect();
         //this.bdBUG.msgPrt("in DBTransSelect-x1!");

         this.conn = DBConn.getConnection();

         //this.bdBUG.msgPrt("Connected!");
       }

       public DBTransSelect(DBConnect DBConn){
         this.bdBUG = new ballDEBUG();
         //this.bdBUG.debugOn();
         //this.bdBUG.msgPrt("in DBTransSelect-2!");

         this.DBConn = DBConn;
         this.conn = DBConn.getConnection();
         //this.bdBUG.msgPrt("Connected!");
       }

       public DBTransSelect(Connection c){
         this.bdBUG = new ballDEBUG();
         //this.bdBUG.debugOn();
         //this.bdBUG.msgPrt("in DBTransSelect-3!");

         this.conn = c;
         //this.bdBUG.msgPrt("Connected!");
       }

       public DBConnect getDBConn(){
         return this.DBConn;
       }


      // giving access to DBConnect functions...
      //public DBConnect getDBase(){
      //  return this.DBConn;
      //}

      // note - this list is filled in doXXXXSelect()
      public ArrayList<SubModel> getSubModelList(){
        return subList;
      }

      public ArrayList<BBooks> doBooksSelect()
      {
        Statement stmt = null;
        String sql = "";
        ArrayList<BBooks> bbookList = new ArrayList<BBooks>();
        subList = new ArrayList<SubModel>();

        BBooks book = null;

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM BOOKS; ";
          ResultSet rs = stmt.executeQuery(sql);

            try {
              while(rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                book = new BBooks(id, name);
                bbookList.add(book);
                subList.add(book);
              }
            } catch ( Exception eN ) {
              System.out.println("Error RecordSet Books (cursor next)");
            }

          stmt.close();
        } catch ( Exception eS ) {
          System.out.println("Error Books (SELECT)");
        }
        return bbookList;
      }


      public ArrayList<League> doLeaguesSelect()
      {
        ArrayList<League> leagueList = new ArrayList<League>();
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM LEAGUES; ";
          ResultSet rs = stmt.executeQuery( sql);

                      try {
                        while(rs.next()){
                          int id = rs.getInt("ID");
                          String name = rs.getString("NAME");
                          League league = new League(id, name);
                          leagueList.add(league);
                        }
                      } catch ( Exception eN ) {
                        System.out.println("Error RecordSet Books (cursor next)");
                      }

          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Leagues (SELECT)");
        }
        return leagueList;
      }


      public ArrayList<Game> doGamesSelect()
      {
        Statement stmt = null;
        String sql = "";
        ArrayList<Game> gameList = new ArrayList<Game>();

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT ID, TEAM_1, TEAM_2, strftime('%Y-%m-%d', GAME_DATE) AS G_DATE, LEAGUE_ID FROM GAMES; ";
          ResultSet rs = stmt.executeQuery(sql);

          try {
            while(rs.next()){
              int id = rs.getInt("ID");
              String name1 = rs.getString("TEAM_1");
              String name2 = rs.getString("TEAM_2");
              String dt = rs.getString("G_DATE");
              int league = rs.getInt("LEAGUE_ID");

              Game game = new Game(id, name1, name2, dt, league);
              gameList.add(game);
            }
          } catch ( Exception eN ) {
            System.out.println("Error RecordSet Games (cursor next)");
          }

          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Games (SELECT)");
        }
        return gameList;
      }


      public ArrayList<GameStat> doGameStatsSelect()
      {
        Statement stmt = null;
        String sql = "";
        ResultSet rs = null;
        ArrayList<GameStat> gameStatsList = new ArrayList<GameStat>();
        GameStat gStat = null;

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM GAME_STATS ; ";
          rs = stmt.executeQuery(sql);
          while(rs.next()){
             gStat = new GameStat( rs.getInt("ID"),
                                     rs.getString("STAT_NAME"),
                                     rs.getFloat("STAT_VALUE"),
                                     rs.getInt("GAME_ID"));

             gameStatsList.add(gStat);
          }
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error gameStats (SELECT)");
        }
        return gameStatsList;
      }



      public ArrayList<Team> doTeamsSelect()
      {
        ArrayList<Team> teamList = new ArrayList<Team>();
        Statement stmt = null;
        String sql = "";

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM TEAMS; ";
          ResultSet rs = stmt.executeQuery(sql);

          try {
            while(rs.next()){
              int id = rs.getInt("ID");
              String name = rs.getString("NAME");
              String school = rs.getString("SCHOOL");
              String notes = rs.getString("NOTES");

              Team team = new Team(id, name, school, notes);
              teamList.add(team);
            }
          } catch ( Exception eN ) {
            System.out.println("Error RecordSet Teams (cursor next)");
          }


          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error Teams (SELECT)");
        }
        return teamList;
      }

      public ArrayList<TeamStat> doTeamStatsSelect()
      {
        Statement stmt = null;
        String sql = "";
        ResultSet rs = null;
        ArrayList<TeamStat> teamStatsList = new ArrayList<TeamStat>();
        TeamStat tStat = null;

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM TEAM_STATS ; ";
          rs = stmt.executeQuery(sql);
          while(rs.next()){
             tStat = new TeamStat( rs.getInt("ID"),
                                     rs.getString("STAT_NAME"),
                                     rs.getFloat("STAT_VALUE"),
                                     rs.getInt("TEAM_ID"));

             teamStatsList.add(tStat);
          }
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error teamStats (SELECT)");
        }
        return teamStatsList;
      }



      public ArrayList<Player> doPlayersSelect(int teamID)
      {
        Statement stmt = null;
        String sql = "";
        ResultSet rs = null;
        ArrayList<Player> playerList = new ArrayList<Player>();
        Player player = null;

        try {
          stmt = this.conn.createStatement();
          sql = "SELECT * FROM PLAYERS WHERE TEAM_ID = " + teamID + "; ";
          rs = stmt.executeQuery(sql);
          while(rs.next()){
             player = new Player(rs.getInt("ID"),
                                 rs.getString("NAME"), rs.getInt("NUMBER"),
                                 rs.getFloat("HEIGHT"), rs.getString("NOTES"),
                                 rs.getInt("TEAM_ID"));
             playerList.add(player);
          }
          stmt.close();
        } catch ( Exception e ) {
          System.out.println("Error PlayerStats (SELECT)");
        }
        return playerList;
      }


         public ArrayList<PlayerStat> doPlayerStatsSelect()
         {
           Statement stmt = null;
           String sql = "";
           ResultSet rs = null;
           ArrayList<PlayerStat> playerStatsList = new ArrayList<PlayerStat>();
           PlayerStat pStat = null;

           try {
             stmt = this.conn.createStatement();
             sql = "SELECT * FROM PLAYER_STATS ; ";
             rs = stmt.executeQuery(sql);
             while(rs.next()){
                pStat = new PlayerStat( rs.getInt("ID"),
                                        rs.getString("STAT_NAME"),
                                        rs.getFloat("STAT_VALUE"),
                                        rs.getInt("PLAYER_ID"));

                playerStatsList.add(pStat);
             }
             stmt.close();
           } catch ( Exception e ) {
             System.out.println("Error PlayerStats (SELECT)");
           }
           return playerStatsList;
         }


         public ArrayList<PlayerStat> doPlayerStatsSelect(int playerID)
         {
           Statement stmt = null;
           String sql = "";
           ResultSet rs = null;
           ArrayList<PlayerStat> playerStatsList = new ArrayList<PlayerStat>();
           PlayerStat pStat = null;

           try {
             stmt = this.conn.createStatement();
             sql = "SELECT * FROM PLAYER_STATS WHERE PLAYER_ID = " + playerID + "; ";
             rs = stmt.executeQuery(sql);
             while(rs.next()){
                pStat = new PlayerStat( rs.getInt("ID"),
                                        rs.getString("STAT_NAME"),
                                        rs.getFloat("STAT_VALUE"),
                                        rs.getInt("PLAYER_ID"));
                playerStatsList.add(pStat);
             }
             stmt.close();
           } catch ( Exception e ) {
             System.out.println("Error PlayerStats (SELECT)");
           }
           return playerStatsList;
         }
       }
