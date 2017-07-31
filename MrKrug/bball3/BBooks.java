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

public class BBooks extends SubModel {
		private ArrayList<Game> gameList = new ArrayList<Game>();
		private ArrayList<Team> teamList = new ArrayList<Team>();

		public BBooks(){
			super();
			setType("BBooks");
		}

		public BBooks(String nm){
			super(nm);
			setType("BBooks");
		}

		public BBooks(int id, String nm){
			super(id, nm);
			setType("BBooks");
		}

		public BBooks(BBooks bk){
			super((SubModel)bk);
			setType("BBooks");
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
