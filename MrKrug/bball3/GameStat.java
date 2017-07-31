package bball;
/***************************************************
 * Basketball book keeping system...
 * Objects:
 *			GameStats
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GameStat extends SubModel {
				private String statName = "";
				private float statValue = 0;
				private int gameID = 0;
				private	Scanner reader = new Scanner(System.in);

				public GameStat (int id, String sName, float sValue, int gameID){
					super(id, sName);
					this.statName = sName;
					this.statValue = sValue;
					this.gameID = gameID;
				}

				public GameStat (String sName, float sValue, int gameID){
					super(0, sName);
					this.statName = sName;
					this.statValue = sValue;
					this.gameID = gameID;
				}

				public int getGameID(){
					return this.gameID;
				}

				public String getStatName(){
					return this.statName;
				}

				public float getStatValue(){
						return this.statValue;
				}

				public void display(){
					System.out.println("The game statistic: (" + this.statName + ") is: " + this.statValue);
				}

				public void inputStat(){
					System.out.print("Enter the statistic name: ");
					String s = reader.next();
					this.statName = s;

					System.out.print("Enter the statistic value (int): ");
					int i = reader.nextInt();
					this.statValue = i;
				}

}
