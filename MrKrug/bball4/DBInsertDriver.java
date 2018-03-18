import bballDB.DBTransInsert;

public class DBInsertDriver {
 	public static void main(String[] argv){
		DBTransInsert DBTI = new DBTransInsert();
		DBTI.doInsert("BOOKS", "BOOK-1");
		DBTI.doInsert("BOOKS", "BOOK-2");
		DBTI.doInsert("LEAGUES", "LEAGUE-1");	
		DBTI.doInsert("LEAGUES", "LEAGUE-2");	
		DBTI.doInsert("LEAGUES", "LEAGUE-3");
	}
}	
