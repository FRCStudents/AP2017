package bball;
import java.sql.*;
import java.util.*;

public class LeagueList {
		private ArrayList<League> leagueList = new ArrayList<League>();
		private String ListName = "";
		private String[] stringList;

		public LeagueList(){
			ListName = "PrimeLeague";
			fixStringList();
		}

		public LeagueList(String name){
			ListName = name;
			fixStringList();
		}

 		private void fixStringList(){
			stringList = new String[leagueList.size()];
		}

		public String[] getStringList(){
			fixStringList();
			for(int i=0; i<leagueList.size(); i++){
				stringList[i] = leagueList.get(i).getName();
			}
			return stringList;
		}

		public void initList(){
			leagueList = new ArrayList<League>();
		}

		public void add(League b){
			leagueList.add(b);
		}

		public void remove(int i){
			leagueList.remove(i);
		}

		public void remove(String name){
			for(int i=leagueList.size()-1; i >= 0; i--){
				if(name.equals(leagueList.get(i).getName())){
					leagueList.remove(i);
				}
			}
		}

		public League get(int i){
			return leagueList.get(i);
		}

		public League get(String name){
			for(int i=0; i<leagueList.size(); i++){
				if(name.equals(leagueList.get(i).getName())){
					return leagueList.get(i);
				}
			}
		return null; 
		}

		public void load(ResultSet rs){
			try {
			   while(rs.next()){
				League b = new League(rs.getInt("ID"), rs.getString("NAME"));
				b.display();
				leagueList.add(b);
			   }
			} catch(Exception e){
				System.out.println("Crash & Burn");
			}
		}
		
		public void displayList(){
			for(int i=0; i < leagueList.size(); i++){
				leagueList.get(i).display();
			}
		}	
}
