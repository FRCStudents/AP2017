package bball;
import java.sql.*;
import java.util.*;

public class GameList {
		private ArrayList<Game> gameList = new ArrayList<Game>();
		private String ListName = "";
		private String[] stringList;

		public GameList(){
			ListName = "PrimeGame";
			fixStringList();
		}

		public GameList(String name){
			ListName = name;
			fixStringList();
		}

 		private void fixStringList(){
			stringList = new String[gameList.size()];
		}

		public String[] getStringList(){
			fixStringList();
			for(int i=0; i<gameList.size(); i++){
				stringList[i] = gameList.get(i).getTeamName1() + "/" + gameList.get(i).getTeamName2();
			}
			return stringList;
		}

		public void initList(){
			gameList = new ArrayList<Game>();
		}

		public void add(Game b){
			gameList.add(b);
			getStringList();
		}

		private void removeFromStringList(int target){
			String[] tempList = new String[stringList.length - 1];
			int j = 0;
			for(int i=0; i < stringList.length; i++){
				if(i != target){
					tempList[j] = stringList[i];
					j++;
				}
			}
		}

		public void remove(int i){
			gameList.remove(i);
			removeFromStringList(i);
		}

		public void remove(String name){
			for(int i=gameList.size()-1; i >= 0; i--){
				if(name.equals(gameList.get(i).getName())){
					gameList.remove(i);
				}
			}
		}

		public void removeById(int id){
			for(int i=gameList.size()-1; i >= 0; i--){
				if(id == gameList.get(i).getId()){
					gameList.remove(i);
				}
			}
		}

		public Game get(int i){
			return gameList.get(i);
		}

		public Game get(String name){
			for(int i=0; i<gameList.size(); i++){
				if(name.equals(gameList.get(i).getName())){
					return gameList.get(i);
				}
			}
		return null; 
		}

		public void load(ResultSet rs){
			try {
			   while(rs.next()){
				Game b = new Game(rs.getInt("ID"), rs.getString("TEAM_1"), rs.getString("TEAM_2"), rs.getString("GAME_DATE"), rs.getInt("LEAGUE_ID"));
				b.display();
				gameList.add(b);
			   }
			} catch(Exception e){
				System.out.println("Crash & Burn");
			}
		}
		
		public void displayList(){
			for(int i=0; i < gameList.size(); i++){
				gameList.get(i).display();
			}
		}	
}
