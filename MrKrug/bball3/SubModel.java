package bball;
/***************************************************
 * Basketball book keeping system...
 * SubModel is inheritted by all Objects below
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
import bballDB.DBDelete;
import bballDB.DBTransInsert;
import bballDB.DBTransUpdate;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SubModel {
		private int id;
		private String name;
		// type is set from inheriting object...
		private String type;

		public SubModel(){
				this.name = "";
		}

		public SubModel(String nm){
			this.name = nm;
		}

		// id comes from database
		public SubModel(int id, String nm){
			this.id = id;
			this.name = nm;
		}

		public SubModel(SubModel sm){
			this.id = sm.getId();
			this.name = sm.getName();
		}

		public String getName (){
			return this.name;
		}

		public int getId(){
			return this.id;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getType(){
			return type;
		}

		public void setId(int i){
			this.id = i;
		}

		public void setType(String s){
			type = s;
		}

		public void doDelete(){
				DBDelete DBConn = new DBDelete();
				int r = getId();
				System.out.println("Serious Deleting: " + r + ":" + getType());
				// switch (type.toLowerCase()){
				// 	case "bbooks":  DBConn.doBooksDelete(r);
				// 									break;
				// 	default: break;
				// }
		}

		public void doUpdate(){
			DBTransUpdate dbTUpdate = new DBTransUpdate();
			// switch (type.toLowerCase()){
			// 	case "bbooks":  dbTUpdate.doBooksUpdate(id, name);
			// 									break;
			// 	default: break;
			// }

		}

		public void doInsert(){
			DBTransInsert dbTInsert = new DBTransInsert();
			dbTInsert.doBooksInsert(getName());

			DBTransUpdate dbTUpdate = new DBTransUpdate();
			// switch (type.toLowerCase()){
			// 	case "bbooks":  dbTUpdate.doBooksUpdate(id, name);
			// 									break;
			// 	default: break;
			// }

		}

}
