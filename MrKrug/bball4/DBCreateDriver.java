import bballDB.DBTableCreate;

public class DBCreateDriver {
 	public static void main(String[] argv){
		DBTableCreate dbTC = new DBTableCreate();
		dbTC.dropDatabase();
		dbTC.createDatabase();
	}
}	
