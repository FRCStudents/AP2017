package bball;

// model classes
import bball.DBRecord;
import bballDB.DBAccess;
import bballDB.DBTransInsert;
import bball.BookList;
import bball.LeagueList;

import java.sql.*;

// view classes
import bball4view.*;

public class Model{  
        DBAccess dbAccess;
        BookList bl;
	LeagueList ll;

	public Model(){
		init();
	}

	public void init(){
		createBookList();
	}

	public LeagueList getLeagueList(){
		System.out.println("Model::getLeagueList");
		return ll;
	}

        public void createLeagueList(String bookName){
                dbAccess = new DBAccess();
		System.out.println(bookName);
		int bookId = getKey("BOOKS", "NAME", bookName);
		System.out.println(bookId);
                ll = new LeagueList();

                DBRecord dbr = new DBRecord(dbAccess.getConnect());
                try {
                        ResultSet rs = dbr.doSelect("LEAGUE", "BOOK_ID", bookId);
                        ll.load(rs);
                } catch ( Exception eN ) {
                        System.out.println("Error RecordSet **League (cursor next)");
                }

        }


	public BookList getBookList(){
		return bl;
	}

	public void createBookList(){
                dbAccess = new DBAccess();
                bl = new BookList();

                DBRecord dbr = new DBRecord(dbAccess.getConnect());
                try {
                        ResultSet rs = dbr.doSelect("BOOKS", -1);
                        bl.load(rs);
                } catch ( Exception eN ) {
                        System.out.println("Error RecordSet **Books (cursor next)");
                }

	}

	int getKey(String recType_in, String field, String value)
	{
		dbAccess = new DBAccess();
		return dbAccess.getKey(recType_in, field, value);
	}

 	//public static void main(String[] argv){
	//		loadBookView();
		//DBTransInsert dbI = new DBTransInsert(dbAccess.getConnect());
		//int x = dbI.doInsert("BOOKS", "BOOK4");
	//}
}	
