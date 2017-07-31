package bball;
/***************************************************
 * Basketball book keeping system...
 * Objects:
 *		Player (has list of PlayerStats)
 *			PlayerStats
 **************************************************/

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PlayerStat extends SubModel {
		//private int id = 0;
		private int playerStatID = 0;
		private int playerID = 0;
	  //private String statName = "";
		private float statValue = 0;
		private int playerNumber = 0;
		private	Scanner reader = new Scanner(System.in);

		public PlayerStat (){
			super(0, "");
		}

		public PlayerStat (String sName, int sValue){
			super(0, sName);
			this.statValue = (float)sValue;
		}

		public PlayerStat (String sName, float sValue, int playerNumber){
			super(0, sName);
			this.statValue = (float)sValue;
			this.playerNumber = playerNumber;
		}

		public PlayerStat (int id, String sName, float sValue, int playerNumber){
			super(id, sName);
			this.statValue = (float)sValue;
			this.playerNumber = playerNumber;
		}

		public void setStatValue(int val){
			this.statValue = (float)val;
		}

		public int getPlayerStatID(){
				return this.playerStatID;
		}

		public int getPlayerID(){
			return this.playerID;
		}


		public float getStatValue(){
				return this.statValue;
		}

		public String getStatName(){
				return getName();
		}

		public void display(){
			System.out.println("The player statistic: (" + getName() + ") is: " + this.statValue);
		}

		public void inputStat(){
			System.out.print("Enter the statistic name: ");
			String s = reader.next();
			setName(s);

			System.out.print("Enter the statistic value (int): ");
			int i = reader.nextInt();
			this.statValue = i;
		}

		public void inputStat(String name){
			setName(name);

			System.out.print("Enter the " + name + " value (int): ");
			int i = reader.nextInt();
			this.statValue = i;
		}

}
