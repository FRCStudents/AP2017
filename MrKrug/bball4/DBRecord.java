package bball;
/***************************************************
 * Basketball book keeping system...
 * DBRecord is inheritted by all Objects below
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
import bballDB.DBAccess;
import bballDB.DBTransInsert;
import bballDB.DBConnect;
//import bballDB.DBTransUpdate;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.*;

public class DBRecord {
		protected int id;
		protected String name;
		protected String type;
		protected DBAccess dbAccess;

		public DBRecord(){
			dbAccess = new DBAccess();
			this.name = "";
		}

		public DBRecord(String nm){
			name = nm;
		}

		public DBRecord(int id, String nm){
			this.id = id;
			name = nm;
		}

		public DBRecord(DBConnect DBConn){
			dbAccess = new DBAccess(DBConn);
			name = "";
		}

		public DBRecord(DBRecord sm){
			id = sm.getId();
			name = sm.getName();
		}

		public void DBClose(){
			//System.out.println("DBRecord::DBClose");
			dbAccess.DBClose();
		}

		public String getName (){
			return name;
		}

		public int getId(){
			return id;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getType(){
			return type;
		}

		public void setId(int i){
			id = i;
		}

		public void setType(String s){
			type = s;
		}

		public int getKey(String recType, String field, String value){
			return dbAccess.getKey(recType, field, value);
		}

		public ResultSet doSelect(String recType, int key){
			return dbAccess.doSelect(recType, key);
		}

                public ResultSet doSelect(String recType, String field, int key){
                        return dbAccess.doSelect(recType, field, key);
                }

		public void doDelete(String recType, int key){
			dbAccess.doDelete(recType, key);
			//System.out.println("Serious Deleting(" + key + "):" + getType());
		}

		public void doUpdate(){
		//	DBTransUpdate dbTUpdate = new DBTransUpdate();

		}

		public void doInsert(){
		//	DBTransInsert dbTInsert = new DBTransInsert();
		//	dbTInsert.doBooksInsert(getName());
		//	DBTransUpdate dbTUpdate = new DBTransUpdate();

		}

}
