package bballDB;

import bballDB.DBTableCreate;

public class DBCreateDriver {

	public DBCreateDriver(){
		DBTableCreate dbTC = new DBTableCreate();
		dbTC.dropDatabase();
		dbTC.createDatabase();
	}

 	public static void main(String[] argv){
		DBTableCreate dbTC = new DBTableCreate();
		dbTC.dropDatabase();
		dbTC.createDatabase();
	}
}	
