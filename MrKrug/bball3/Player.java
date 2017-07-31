package bball;
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

public class Player extends SubModel {
		private int playerNumber = 0;
		private float playerHeight = 0;
		private String playerNotes = "";
		private int playerTeamID = 0;

		private ArrayList<PlayerStat> playerStatsList = new ArrayList<PlayerStat>();
		private String[] statNames = new String[]{"Offensive Fouls", "Defensive Fouls", "Foul Shots", "Offensive Rebounds", "Defensive Rebounds"};
		private	Scanner reader = new Scanner(System.in).useDelimiter("\\n");

		public Player (){
			super(0, "NO NAME");
		}

		public Player (String pName, int pNumber, float pHeight, String pNotes, int pTeamID){
			super(0, pName);
			this.playerNumber = pNumber;
			this.playerHeight = pHeight;
			this.playerNotes = pNotes;
			this.playerTeamID = pTeamID;
		}

		public Player (int id, String pName, int pNumber, float pHeight, String pNotes, int pTeamID){
			super(id, pName);
			this.playerNumber = pNumber;
			this.playerHeight = pHeight;
			this.playerNotes = pNotes;
			this.playerTeamID = pTeamID;
		}

		public Player (String pName){
			super(0, pName);
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
			System.out.println("Player: " + getName());
		}
}
