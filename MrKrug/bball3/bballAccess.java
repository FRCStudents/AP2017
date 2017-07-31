package DBAccess;

import bballDB.DBTransSelect;

import bball.SubModel;
import bball.League;
import bball.BBooks;

import bballDB.DBConnect;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class bballAccess {
			ArrayList <SubModel> SubModelList = null;
			ArrayList leagueList = null;
			ArrayList<BBooks> booksList = null;
			ArrayList teamList = null;
			ArrayList gameList = null;
			ArrayList playerList = null;
			ArrayList playerStatList = null;

			DBTransSelect dbTransSelect  = null;
			DBConnect DBConn = null;

			public bballAccess(){
				ArrayList<League> leagueList = new ArrayList<League>();
				this.dbTransSelect = new DBTransSelect();
				this.DBConn = this.dbTransSelect.getDBConn();
				this.leagueList = this.dbTransSelect.doLeaguesSelect();
				this.booksList = this.dbTransSelect.doBooksSelect();
				this.teamList = this.dbTransSelect.doTeamsSelect();
				this.gameList = this.dbTransSelect.doGamesSelect();
			}

			public DBConnect getDBConn(){
				return this.DBConn;
			}

			public ArrayList<BBooks> getBookList(){
				return this.booksList;
			}

			public ArrayList<SubModel> getSubModeList(){
				return this.SubModelList;
			}

			public void refreshBookList(){
				this.booksList = null;
				this.booksList = this.dbTransSelect.doBooksSelect();
				this.SubModelList = this.dbTransSelect.getSubModelList();
			}

			public void refreshTeamList(){
				this.teamList = null;
				this.teamList = this.dbTransSelect.doTeamsSelect();
			}

			public void refreshGameList(){
				this.gameList = null;
				this.gameList = this.dbTransSelect.doGamesSelect();
			}

			public void refreshPlayerList(int currentTeam){
				this.playerList = null;
				System.out.println("Current team: " + currentTeam);
				this.playerList = this.dbTransSelect.doPlayersSelect(currentTeam);
			}

			public ArrayList getLeagueList(){
				return this.leagueList;
			}

			public ArrayList getTeamList(){
				return this.teamList;
			}
			public ArrayList getGameList(){
				return this.gameList;
			}
			public ArrayList getPlayerList(int teamID){
				this.playerList = this.dbTransSelect.doPlayersSelect(teamID);
				return this.playerList;
			}
			public ArrayList getPlayerStatList(int playerID){
				this.playerStatList = this.dbTransSelect.doPlayerStatsSelect(playerID);
				return this.playerStatList;
			}
}
