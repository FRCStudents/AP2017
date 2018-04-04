// model classes
import bball.DBRecord;
import bballDB.DBAccess;
import bballDB.DBTransInsert;
import bball.BookList;

import java.sql.*;

// view classes
import books.*;
import bview.BView;

class DBRecordDriver {
 	public static void main(String[] argv){
		DBAccess dbAccess = new DBAccess();
		BookList bl = new BookList();

		DBTransInsert dbI = new DBTransInsert(dbAccess.getConnect());
		int x = dbI.doInsert("BOOKS", "BOOK4");

		DBRecord dbr = new DBRecord(dbAccess.getConnect());
		for (int i=2; i < 14; i++){
			//dbr.doDelete("BOOKS", i);
		
		}

		String[] sList = bl.getStringList();
		BView bView = new BView(sList);
		
          	try {
			ResultSet rs = dbr.doSelect("BOOKS", -1);
			bl.load(rs);			
			//bl.remove("BOOK3");
	//		bl.displayList();
			//while(rs.next()){
                //		int id = rs.getInt("ID");
                //		String name = rs.getString("NAME");
                //		System.out.println("====> " + id + ":" + name);	
              	//	}
            	} catch ( Exception eN ) {
              		System.out.println("Error RecordSet **Books (cursor next)");
            	}

                dbAccess.getConnect().commitDB();
                dbAccess.getConnect().closeDB();
	}
}	
