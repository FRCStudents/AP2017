package bball;

/**
 * This Controller is essentially the top level
 * to DB access. 
 * This is a singleton design pattern.
 */

import bball.Model;

import bball.BookList;
import bball.LeagueList;

public class Navigator {
   private static Model model = null;
   private static int Dprint = 1;
   private static Navigator instance = null;
   private static String currentModelName = "";
   private static String nextModelName = "";

   private static int command = 999;

   private static int currentIntChoice = 0;
   private static String currentStringChoice = "";
   private static String[] stringArray;

   private static BookList bookList;
   private static LeagueList leagueList;

   private Navigator() {
      // Exists only to defeat instantiation.
   }

   public static Navigator getInstance() {
      if(instance == null) {
         instance = new Navigator();
	 model = new Model();
	 bookList = model.getBookList();
      }
      return instance;
   }

   public static int getCommand(){
	int hold = command;
        if(Dprint == 2){
                System.out.println("Get Command: [" + Dprint + "]" + hold);
                Dprint = 3;
        }
	if(Dprint == 1){
		System.out.println("Get Command: " + hold);
		if(hold < 100){
			Dprint = 2;
		}
	}
	return hold;
   }

   public static void setCommand(int c){
	System.out.println("Set Command: " + c);
	command = c;
   }

   public static BookList getBookList(){
	return bookList;
   }

   public static LeagueList getLeagueList(){
	return leagueList;
   }
  
   public static String[] getStringArray(){
	return stringArray;
   }

   public static void createLeagueList(){
	model.createLeagueList(currentStringChoice);
	leagueList = model.getLeagueList();
	stringArray = leagueList.getStringList();
   }
 
   public static void setCurrentModelName(String nm){
	currentModelName = nm;
   }

   public static void setNextModelName(String nm){
	nextModelName = nm;
   }

   public static String getNextModelName(){
	return nextModelName;
   }

   public static void setCurrentIntChoice(int c){
	currentIntChoice = c;
   }

   public static String getCurrentStringChoice(){
	return currentStringChoice;
   }

   public static void setCurrentStringChoice(String choice){
	currentStringChoice = choice;
   }

   private void init(){
	currentModelName = "Books";
	currentIntChoice = 0;
	currentStringChoice = "";
   }
}
