import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class BBallMenu {
		private int level = 1;
		private int currentTeam = 0;
		private int currentPlayer = 0;

		public BBallMenu(){
				this.level = 1;
		}

		public void showCurrent(){
			System.out.println("Current Team: " + this.currentTeam);
			System.out.println("Current Player: " + this.currentPlayer);
		}

		private void print_line(){
			for(int i=0; i < 50; i++){
			 	System.out.print("*");
			}
			System.out.println("");
		}

		private void print_line(String s){
			System.out.print("*\t\t");
			System.out.print(s);
			System.out.println("");
		}

		private void print_line(int n, String s){
			System.out.print("*\t");
			System.out.print(n + ")\t");
			System.out.print(s);
			System.out.println("");
		}

		private void print_line(char n, String s){
			System.out.print("*\t");
			System.out.print(n + ")\t");
			System.out.print(s);
			System.out.println("");
		}

		private int getInput(String prompt){
			Scanner reader = new Scanner(System.in);
			int i = 0;
			try {
				this.print_line(prompt);
				i = reader.nextInt();
				return i;
			} catch (Exception e){
				//System.out.println("\n>>>>>>>>>>>>>> sorry - invalid input: " + i);
			}
			return -1;
		}

		public void menu_001(){
			this.print_line();
			this.print_line(0, "Input");
			this.print_line(1, "List Teams");
			this.print_line(2, "List Games");
			this.print_line(3, "Choose Team");
			this.print_line(4, "Choose Player");
			this.print_line(19, "Show Current");
			this.print_line('e', "End Program");
			this.print_line();
		}

		public void menu_002(){
			this.print_line();
			this.print_line(1, "New Team");
			this.print_line(2, "New Game");
			this.print_line(3, "New Player");
			this.print_line(7, "Back to main menu");
			this.print_line();
		}

		public int menuRun(){
				int response = 0;
				if(this.level == 1){
					this.menu_001();
				} else {
					this.menu_002();
				}
				response = this.getInput("Enter a number for your choice \n>>>>>>>>>>>>>> ");
				return response;
		}

		public void doMenuChoice_002(int choice, bballAccess data){
				//DBConnect DBConn = data.getDBConn();
				int r = 0;

				if(choice == 1){
					this.print_line("New Team");
					//bballDBTransInsert bballDBTransInsert = new bballDBTransInsert(data.getDBConn());
					DBTransInsert dbTransInsert = new DBTransInsert(data.getDBConn());
					Team t = new Team();
					t.inputTeam();
					r = dbTransInsert.doTeamsInsert(t);
					this.currentTeam = r;
					//r = dbTransInsert.doTeamsInsert("Panthers", "ISB", "Also an Insanely good team");
					data.refreshTeamList();
				}

				if(choice == 2){
					this.print_line("New Game");
					//bballDBTransInsert bballDBTransInsert = new bballDBTransInsert(data.getDBConn());
					DBTransInsert dbTransInsert = new DBTransInsert(data.getDBConn());
					Game g = new Game();
					g.inputGame();
					r = dbTransInsert.doGamesInsert(g);
					//r = dbTransInsert.doTeamsInsert("Panthers", "ISB", "Also an Insanely good team");
					data.refreshGameList();
				}

				if(choice == 3){
					this.print_line("New Player");
					//bballDBTransInsert bballDBTransInsert = new bballDBTransInsert(data.getDBConn());
					DBTransInsert dbTransInsert = new DBTransInsert(data.getDBConn());
					Player p = new Player();
					p.inputPlayer(this.currentTeam);
					r = dbTransInsert.doPlayersInsert(p);
					this.currentPlayer = r;
					data.refreshPlayerList(this.currentTeam);
				}


				if(choice == 7){
					this.level = 1;
					return;
				}

		}


		public void doMenuChoice(int choice, bballAccess data){
				if(this.level > 1){
					doMenuChoice_002(choice, data);
					return;
				}

				if(choice < 1){
					this.level = 2;
					return;
				}

				if(choice == 1){
					this.print_line("Team List");
					ArrayList tl = data.getTeamList();
					for(int i=0; i < tl.size(); i++){
							Team t = null;
							t = (Team)tl.get(i);
							this.print_line(t.getId() + "::" +
													t.getName()+ "::" +
													t.getSchool() + "::" +
													t.getNotes());
												}
				}

				if(choice == 2){
					ArrayList gl = data.getGameList();
					this.print_line("Game List");
					for(int i=0; i < gl.size(); i++){
							Game g = null;
							g = (Game)gl.get(i);
							this.print_line(g.getId() + "::" +
													g.getGameDate()+ "::" +
													g.getTeamName1() + "::" +
													g.getTeamName2());
												}
				}

				if(choice == 3){
					int response = this.getInput("Enter the number for your team \n>>>>>>>>>>>>>> ");
					ArrayList pl = data.getPlayerList(response);
					this.currentTeam = response;
					this.print_line("Player List");
					for(int i=0; i < pl.size(); i++){
							Player p = null;
							p = (Player)pl.get(i);
							this.print_line(p.getId() + "::" +
													p.getName()+ "::" +
													p.getPlayerNumber() + "::" +
													p.getPlayerHeight() + "::" +
													p.getPlayerNotes());
												}
				}

				if(choice == 4){
					int response = this.getInput("Enter the number for your player \n>>>>>>>>>>>>>> ");
					ArrayList psl = data.getPlayerStatList(response);
					this.currentPlayer = response;
					this.print_line("Player Stat List");
					for(int i=0; i < psl.size(); i++){
							PlayerStat p = null;
							p = (PlayerStat)psl.get(i);
							this.print_line(p.getId() + "::" +
													p.getStatName()+ "::" +
													p.getStatValue());
												}
				}

				if(choice == 19){
					this.showCurrent();
				}

		}

		public void __menu_001(){
			this.print_line();
			this.print_line("This is something");
			this.print_line(1, "This is something");
			this.print_line();
			int x = 0;
			while (x > -1){
				x = this.getInput("Give me a line...");
			}
		}

}

class bballAccess {
	ArrayList leagueList = null;
	ArrayList booksList = null;
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

	public ArrayList getBookList(){
		return this.booksList;
	}

	public void refreshBookList(){
		this.booksList = null;
		this.booksList = this.dbTransSelect.doBooksSelect();
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

public class bballCLIRun {
	public static void main(String[] args){
			BBallMenu bbmenu = new BBallMenu();
			bballAccess bAccess = new bballAccess();
			ArrayList al = bAccess.getLeagueList();
			ArrayList tl = bAccess.getTeamList();
			int menuChoice = 1;

			while (menuChoice > -1){
					menuChoice = bbmenu.menuRun();
					bbmenu.doMenuChoice(menuChoice, bAccess);
				}
		}
	}
