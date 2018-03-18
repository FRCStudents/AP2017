import bballDB.DBTransInsert;

public class DBInsertDriver {
 	public static void main(String[] argv){
		DBTransInsert DBTI = new DBTransInsert();
		DBTI.doInsert("BOOKS", "BOOK-1", 0);
		DBTI.doInsert("BOOKS", "BOOK-2", 0);
		DBTI.doInsert("LEAGUES", "LEAGUE-1", 1);	
		DBTI.doInsert("LEAGUES", "LEAGUE-2", 1);	
		DBTI.doInsert("LEAGUES", "LEAGUE-3", 1);
	}
}	
