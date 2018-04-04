package bball;

/**
 * This Controller is essentially the top level
 * to DB access. 
 * This is a singleton design pattern.
 */

import java.util.concurrent.TimeUnit;

import bball.Model;

import bball.BookList;
import bball.LeagueList;

public class Navigator {
   private static Model model = null;
   private static int Dprint = 1;
   private static Navigator instance = null;
   private static String currentModelName = "";
   private static String nextModelName = "";
   private static String bookName = "";

   private static int command = 999;

   private static int currentIntChoice = 0;
   private static String currentStringChoice = "";
   private static String field001 = "";

   private static String newVal = "";
   private static String oldVal = "";

   private static String[] stringArray;

   private static BookList bookList;
   private static LeagueList leagueList;
   private static GameList gameList;

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
                //System.out.println("Get Command: [" + Dprint + "]" + hold);
                Dprint = 3;
        }
	if(Dprint == 1){
		//System.out.println("Get Command: " + hold);
		if(hold < 100){
			Dprint = 2;
		}
	}
        //try {
        //       TimeUnit.SECONDS.sleep(1);
        //} catch(Exception e){
        //       System.out.println("Insomiac");
        //}
	return hold;
   }

   public static void setCommand(int c){
	System.out.println("Set Command: " + c);
	command = c;
   }

   public static void setNewVal(String v){
	newVal = v;
   }

   public static void setOldVal(String o){
	oldVal = o;
   }

   public static String getOldVal(){
	return oldVal;
   }

   public static String getNewVal(){
	return newVal;
   }

   public static BookList getBookList(){
	return bookList;
   }

   public static void setBookName(String bName){
	bookName = bName;
   }

   public static String getBookName(){
	return bookName;
   }

   // notice: currentModelName is the database record, and
   // 		currentIntChoice is position in the list!
   //		we need to convert that the the ID 
   //
   public static void deleteItem(){
	model.doDelete(currentModelName, getDBKey());
	if(currentModelName.equals("GAMES")){
		gameList.remove(currentIntChoice - 1);
	}
        if(currentModelName.equals("LEAGUES")){
                leagueList.remove(currentIntChoice - 1);
        }
   }

   public static void addItem(String[] fields){
	model.doAdd(currentModelName, fields);
   }

   public static void changeItem(String[] fields){
	model.doChange(currentModelName, fields);
   }

   private static int getDBKey(){       
	if(currentModelName.equals("GAMES")){
		return gameList.get(currentIntChoice - 1).getId();
	}
        if(currentModelName.equals("LEAGUES")){
                return leagueList.get(currentIntChoice - 1).getId();
        }

	return 0;
   }

   public static GameList getGameList(){
	return gameList;
   }

   public static LeagueList getLeagueList(){
	return leagueList;
   }
  
   public static String[] getStringArray(){
	return stringArray;
   }

   public static void createGameList(){
	model.createGameList(currentStringChoice);
	gameList = model.getGameList();
	stringArray = gameList.getStringList();
   }

   public static void createLeagueList(){
	model.createLeagueList(bookName);
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
	//System.out.println("GET CurrentStringChoice: " + currentStringChoice);
	return currentStringChoice;
   }

   public static void setCurrentStringChoice(String choice){
	//System.out.println("SET CurrentStringChoice: " + choice);
	currentStringChoice = choice;
   }

   public static void setField001(String field){
	field001 = field;
   }

   public static String getField001(){
	return field001;
   }

   private void init(){
	currentModelName = "Books";
	currentIntChoice = 0;
	currentStringChoice = "";
   }
}
