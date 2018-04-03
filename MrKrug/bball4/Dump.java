import bballDB.DBAccess;
import bball.Game;
import bball.League;

import java.sql.*;

public class Dump{
	public static void main(String[] argv){
		DBAccess dba = new DBAccess();

                        try {
			   System.out.println("GAMES...");
			   ResultSet rs = dba.doSelect("GAMES", -1);
                           while(rs.next()){
                                Game b = new Game(rs.getInt("ID"), rs.getString("TEAM_1"), rs.getString("TEAM_2"), rs.getString("GAME_DATE"), rs.getInt("LEAGUE_ID"));
                                b.display();
                           }
                        } catch(Exception e){
                                System.out.println("Crash & Burn");
                        }
                        try {
                           System.out.println("LEAGUES...");
                           ResultSet rs = dba.doSelect("LEAGUES", -1);
                           while(rs.next()){
                                League l = new League(rs.getInt("ID"), rs.getString("NAME"), rs.getInt("BOOK_ID"));
                                l.display();
                           }
                        } catch(Exception e){
                                System.out.println("Crash & Burn");
                        }



	}
}
