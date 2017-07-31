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

public class TeamStat extends SubModel{
				//private String statName = "";
				private float statValue = 0;
				private int teamID = 0;
				private	Scanner reader = new Scanner(System.in);

				public TeamStat (int id, String sName, float sValue, int teamID){
					super(id, sName);
					this.statValue = sValue;
					this.teamID = teamID;
				}

				public TeamStat (String sName, float sValue){
					super(0, sName);
					this.statValue = sValue;
				}

				public TeamStat (String sName){
					super(0, sName);
					this.statValue = -1;
				}

				public void setStatValue(float val){
					this.statValue = (float)val;
				}

				public int getTeamID(){
					return this.teamID;
				}


				public float getStatValue(){
						return this.statValue;
				}

				public String getStatName(){
						return getName();
				}


				public void display(){
					System.out.println("The team statistic: (" + getName() + ") is: " + this.statValue);
				}

				public void inputStat(){
					System.out.print("Enter the statistic name: ");
					String s = reader.next();
					setName(s);

					System.out.print("Enter the statistic value (float): ");
					float f = reader.nextFloat();
					this.statValue = f;
				}

				public void inputStat(String name){
					setName(name);

					System.out.print("Enter the " + name + " value (int): ");
					int i = reader.nextInt();
					this.statValue = i;
				}

}
