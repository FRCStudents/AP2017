package bball;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Game extends DBRecord{
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
			this.gameDate = "01-12-2017";
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

		public void setName(String dt){
			super.setName(dt);
		}

		public int getId(){
			return this.id;
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

		public void display(){
			System.out.println("GAME ID: " + id);
			System.out.println(teamName1 + " vs " + teamName2);  
			System.out.println("On: " + gameDate);
			System.out.println("League: " + league);
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
