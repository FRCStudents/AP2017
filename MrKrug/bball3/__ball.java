/***************************************************
 * Basketball book keeping system...
 * Objects:
 *		League (Has list of Seasons, Has list of Teams)
 *		Season (has list of Games)
 *		Game (has 2 Teams, has GameStats)
 *			GameStats
 *		Team (has list of Players, has TeamStats)
 *			TeamStats
 *		Player (has list of PlayerStats)
 *			PlayerStats
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class BBooks {
		private int id;
		private String name;
		private ArrayList<Game> gameList = new ArrayList<Game>();
		private ArrayList<Team> teamList = new ArrayList<Team>();

		public BBooks(){
				this.name = "";
		}

		public BBooks(String nm){
			this.name = nm;
		}

		// id comes from database
		public BBooks(int id, String nm){
			this.id = id;
			this.name = nm;
		}

		public String getName (){
			return this.name;
		}

		public int getId(){
			return this.id;
		}

		public void setGameList(ArrayList<Game> gList){
      for (int j=0; j < gList.size(); j++){
          this.gameList.add(gList.get(j));
        }
		}

		public void setTeamList(ArrayList<Team> tList){
      for (int j=0; j < tList.size(); j++){
          this.teamList.add(tList.get(j));
        }
		}

}

class League {
	private int id;
	private String name;
	private ArrayList<Game> gameList = new ArrayList<Game>();
	public League(){
			this.name = "";
	}

	public League(String nm){
		this.name = nm;
	}

	public League(int id, String nm){
		this.id = id;
		this.name = nm;
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}


}

class Game {
		private String gameDate =  "";
		private String teamName1 = "";
		private String teamName2 = "";
		private int league = 0;
		private int id;
		private	Scanner reader = new Scanner(System.in).useDelimiter("\\n");

		public Game(String tname){
			this.teamName1 = tname;
		}

		public Game(){
			this.gameDate = "2017-01-12";
		}


		// for new - insert into database
		public Game(String nm1, String nm2, String dt, int leagueID){
			this.id = 0;
			this.teamName1 = nm1;
			this.teamName2 = nm2;
			this.gameDate = dt;
			this.league = leagueID;
		}

		// build from database read...
		public Game(int id, String nm1, String nm2, String dt, int leagueID){
			this.id = id;
			this.teamName1 = nm1;
			this.teamName2 = nm2;
			this.gameDate = dt;
			this.league = leagueID;
		}

		public String getTeamName1(){
			return this.teamName1;
		}

		public void setTeamName1(String name){
			this.teamName1 = name;
		}

		public String getTeamName2(){
			return this.teamName2;
		}

		public void setTeamName2(String name){
			this.teamName2 = name;
		}

		public String getGameDate(){
			//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			//return dateFormat.format(this.gameDate);
			return this.gameDate;
		}

		public void setGameDate(String dt){
			this.gameDate = dt;
			//this.gameDate = "2017-01-12";
		}

		public int getLeague(){
			return this.league;
		}

		public void setLeague(int l){
			this.league = l;
		}

		public int getId(){
			return this.id;
		}

		public void inputGame(){
			System.out.print("Enter the first team name: ");
			String s = reader.next();
			this.setTeamName1(s);

			System.out.print("Enter the second team name: ");
			s = reader.next();
			this.setTeamName2(s);

			System.out.print("Enter the game date (yyyy-mm-dd): ");
			s = reader.next();
			this.setGameDate(s);

			System.out.print("Enter league id: ");
			int i = reader.nextInt();
			this.setLeague(i);

		}


}

class GameStat {
				private int id = 0;
				private String statName = "";
				private float statValue = 0;
				private int gameID = 0;
				private	Scanner reader = new Scanner(System.in);

				public GameStat (int id, String sName, float sValue, int gameID){
					this.statName = sName;
					this.statValue = sValue;
					this.gameID = gameID;
				}

				public GameStat (String sName, float sValue, int gameID){
					this.statName = sName;
					this.statValue = sValue;
					this.gameID = gameID;
				}

				public int getGameID(){
					return this.gameID;
				}

				public int getId(){
					return this.id;
				}

				public String getStatName(){
					return this.statName;
				}

				public float getStatValue(){
						return this.statValue;
				}

				public void display(){
					System.out.println("The game statistic: (" + this.statName + ") is: " + this.statValue);
				}

				public void inputStat(){
					System.out.print("Enter the statistic name: ");
					String s = reader.next();
					this.statName = s;

					System.out.print("Enter the statistic value (int): ");
					int i = reader.nextInt();
					this.statValue = i;
				}

}

class Team {
		private int id = 0;
		private String teamName = "";
		private String school = "";
		private String notes = "";

		private ArrayList<Player> teamList = new ArrayList<Player>();
		private ArrayList<TeamStat> teamStatsList = new ArrayList<TeamStat>();
		private String[] statNames = new String[]{"Offensive Fouls", "Defensive Fouls", "Foul Shots", "Offensive Rebounds", "Defensive Rebounds"};

		private	Scanner reader = new Scanner(System.in).useDelimiter("\\n");

		public Team (){
			this.teamName = "NONAME";
		}

		public Team (String tName){
			this.teamName = tName;
		}

		public Team (String tName, String school, String notes){
			this.teamName = tName;
			this.school = school;
			this.notes = notes;
		}

		public Team (int id, String tName, String school, String notes){
			this.id = id;
			this.teamName = tName;
			this.school = school;
			this.notes = notes;
		}

		public String getName (){
			return this.teamName;
		}

		public void setName (String name){
			this.teamName = name;
		}

		public String getSchool(){
			return this.school;
		}

		public void setSchool (String school){
			this.school = school;
		}

		public String getNotes(){
			return this.notes;
		}

		public void setNotes (String notes){
			this.notes = notes;
		}

		public int getId(){
			return this.id;
		}

		public void inputTeam(){
			boolean r = true;

			System.out.print("Enter the team name: ");
			String s = reader.next();
			this.setName(s);

			System.out.print("Enter the school: ");
			s = reader.next();
			this.setSchool(s);

			System.out.print("Enter notes: ");
			s = reader.next();
			this.setNotes(s);

		}

		public void inputStats(){
			int i = 0;

			for(i=0; i<this.statNames.length;i++){
				TeamStat tStat = new TeamStat(this.statNames[i]);
				tStat.inputStat(this.statNames[i]);
				this.teamStatsList.add(tStat);
			}
		}

		public void display(){
			System.out.println("Team: " + this.teamName);

			for (TeamStat ts: this.teamStatsList){
				ts.display();
			}
		}

}


class TeamStat {
				private int id = 0;
				private String statName = "";
				private float statValue = 0;
				private int teamID = 0;
				private	Scanner reader = new Scanner(System.in);

				public TeamStat (int id, String sName, float sValue, int teamID){
					this.id = id;
					this.statName = sName;
					this.statValue = sValue;
					this.teamID = teamID;
				}

				public TeamStat (String sName, float sValue){
					this.statName = sName;
					this.statValue = sValue;
				}

				public TeamStat (String sName){
					this.statName = sName;
					this.statValue = -1;
				}

				public int getId(){
					return this.id;
				}

				public void setStatValue(float val){
					this.statValue = (float)val;
				}

				public int getTeamID(){
					return this.teamID;
				}


				public float getStatValue(){
						return this.statValue;
				}

				public String getStatName(){
						return this.statName;
				}


				public void display(){
					System.out.println("The team statistic: (" + this.statName + ") is: " + this.statValue);
				}

				public void inputStat(){
					System.out.print("Enter the statistic name: ");
					String s = reader.next();
					this.statName = s;

					System.out.print("Enter the statistic value (float): ");
					float f = reader.nextFloat();
					this.statValue = f;
				}

				public void inputStat(String name){
					this.statName = name;

					System.out.print("Enter the " + name + " value (int): ");
					int i = reader.nextInt();
					this.statValue = i;
				}

}

class Player {
		private int id = 0;
		private String playerName = "";
		private int playerNumber = 0;
		private float playerHeight = 0;
		private String playerNotes = "";
		private int playerTeamID = 0;

		private ArrayList<PlayerStat> playerStatsList = new ArrayList<PlayerStat>();
		private String[] statNames = new String[]{"Offensive Fouls", "Defensive Fouls", "Foul Shots", "Offensive Rebounds", "Defensive Rebounds"};
		private	Scanner reader = new Scanner(System.in).useDelimiter("\\n");

		public Player (){
			this.playerName = "NO NAME";
		}

		public Player (String pName, int pNumber, float pHeight, String pNotes, int pTeamID){
			this.playerName = pName;
			this.playerNumber = pNumber;
			this.playerHeight = pHeight;
			this.playerNotes = pNotes;
			this.playerTeamID = pTeamID;
		}

		public Player (int id, String pName, int pNumber, float pHeight, String pNotes, int pTeamID){
			this.id = id;
			this.playerName = pName;
			this.playerNumber = pNumber;
			this.playerHeight = pHeight;
			this.playerNotes = pNotes;
			this.playerTeamID = pTeamID;
		}

		public Player (String pName){
			this.playerName = pName;
		}

		public String getPlayerNotes(){
			return this.playerNotes;
		}

		public float getPlayerHeight(){
			return this.playerHeight;
		}

		public int getPlayerNumber(){
			return this.playerNumber;
		}

		public void setPlayerNumber(int i){
			this.playerNumber = i;
		}

		public int getPlayerTeamID(){
			return this.playerTeamID;
		}

		public void setPlayerTeamID(int i){
			this.playerTeamID = i;
		}

		public int getId(){
			return this.id;
		}
		public String getName (){
			return this.playerName;
		}

		public void setName (String name){
			this.playerName = name;
		}

		public void setPlayerHeight (float f){
			this.playerHeight = f;
		}

		public void setPlayerNotes (String s){
			this.playerNotes = s;
		}

		public void inputPlayer(int teamID){
			System.out.print("Enter the player name: ");
			String s = reader.next();
			this.setName(s);

			System.out.print("Enter the player number: ");
			int i = reader.nextInt();
			this.setPlayerNumber(i);

			System.out.print("Enter the player height: ");
			float f = reader.nextFloat();
			this.setPlayerHeight(f);

			System.out.print("Enter notes: ");
			s = reader.next();
			this.setPlayerNotes(s);

			this.setPlayerTeamID(teamID);
		}

		public void inputStats(){
			for(int i=0; i<this.statNames.length;i++){
				PlayerStat pStat = new PlayerStat();
				pStat.inputStat(this.statNames[i]);
				this.playerStatsList.add(pStat);
			}
		}

		public void display(){
			System.out.println("Player: " + this.playerName);

			//int i = 0;
			//for (PlayerStat ps: this.playerStatsList){
			//	ps.display();
			//}
		}
}

class PlayerStat {
		private int id = 0;
		private int playerStatID = 0;
		private int playerID = 0;
		private String statName = "";
		private float statValue = 0;
		private int playerNumber = 0;
		private	Scanner reader = new Scanner(System.in);

		public PlayerStat (){
			this.statName = "";
			this.statValue = -1;
		}

		public PlayerStat (String sName, int sValue){
			this.statName = sName;
			this.statValue = (float)sValue;
		}

		public PlayerStat (String sName, float sValue, int playerNumber){
			this.statName = sName;
			this.statValue = (float)sValue;
			this.playerNumber = playerNumber;
		}

		public PlayerStat (int id, String sName, float sValue, int playerNumber){
			this.id = id;
			this.statName = sName;
			this.statValue = (float)sValue;
			this.playerNumber = playerNumber;
		}

		public int getId(){
			return this.id;
		}

		public void setStatValue(int val){
			this.statValue = (float)val;
		}

		public int getPlayerStatID(){
				return this.playerStatID;
		}

		public int getPlayerID(){
			return this.playerID;
		}


		public float getStatValue(){
				return this.statValue;
		}

		public String getStatName(){
				return this.statName;
		}

		public void display(){
			System.out.println("The player statistic: (" + this.statName + ") is: " + this.statValue);
		}

		public void inputStat(){
			System.out.print("Enter the statistic name: ");
			String s = reader.next();
			this.statName = s;

			System.out.print("Enter the statistic value (int): ");
			int i = reader.nextInt();
			this.statValue = i;
		}

		public void inputStat(String name){
			this.statName = name;

			System.out.print("Enter the " + name + " value (int): ");
			int i = reader.nextInt();
			this.statValue = i;
		}

}

/*********************************************
 * bball
 * main to create/call Books...
 *********************************************/

public class bball {
	public static void main(String[] args){
			BBooks bbooks = new BBooks();
			Team t = new Team("Galcons");
			t.inputTeam();

			Player p = new Player("Billy");
			p.inputStats();
			p.display();

			PlayerStat PS = new PlayerStat("MyStat", 6);
			PS.inputStat();
			PS.display();
		}
	}
