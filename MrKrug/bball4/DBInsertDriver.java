package bballDB;

import bballDB.DBTransInsert;

public class DBInsertDriver {
 	public DBInsertDriver(){
		DBTransInsert DBTI = new DBTransInsert();
		DBInsert01(DBTI, "A");
		DBInsert01(DBTI, "B");
		DBInsert01(DBTI, "C");
	}


        public void DBInsert01(DBTransInsert DBTI, String prefix){
                String[] values = new String[3];
                values[0] = prefix + "BOOK-1";
                DBTI.doInsert("BOOKS", values, 0);
                values[0] = prefix + "BOOK-2";
                DBTI.doInsert("BOOKS", values, 0);
                values[0] = prefix + "LEAGUE-1";
                DBTI.doInsert("LEAGUES", values, 1);
                values[0] = prefix + "LEAGUE-2";
                DBTI.doInsert("LEAGUES", values, 1);
                values[0] = prefix + "LEAGUE-3";
                DBTI.doInsert("LEAGUES", values, 1);
                values[0] = prefix + "TEAM-1";
                values[1] = prefix + "TEAM-2";
                values[2] = "2018-05-15";
                DBTI.doInsert("GAMES", values, 1);
                values[0] = prefix + "TEAM-2";
                values[1] = prefix + "TEAM-3";
                values[2] = "2018-05-23";
                DBTI.doInsert("GAMES", values, 1);
        }

	public static void main(String[] argv){
		DBInsertDriver DBID = new DBInsertDriver();
	}
}	
