package bball;
/***************************************************
 * Basketball book keeping system...
 * Objects:
 *		Team (has list of Players, has TeamStats)
 *			TeamStats
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Team extends SubModel {
		private String school = "";
		private String notes = "";

		private ArrayList<Player> teamList = new ArrayList<Player>();
		private ArrayList<TeamStat> teamStatsList = new ArrayList<TeamStat>();
		private String[] statNames = new String[]{"Offensive Fouls", "Defensive Fouls", "Foul Shots", "Offensive Rebounds", "Defensive Rebounds"};

		private	Scanner reader = new Scanner(System.in).useDelimiter("\\n");

		public Team (){
			super(0, "NONAME");
		}

		public Team (String tName){
			super(0, tName);
		}

		public Team (String tName, String school, String notes){
			super(0, tName);
			this.school = school;
			this.notes = notes;
		}

		public Team (int id, String tName, String school, String notes){
			super(id, tName);
			this.school = school;
			this.notes = notes;
		}

		public void setTeamName(String name){
			setName(name);
		}

		public String getTeamName(){
			return super.getName();
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
			System.out.println("Team: " + getName());

			for (TeamStat ts: this.teamStatsList){
				ts.display();
			}
		}

}
