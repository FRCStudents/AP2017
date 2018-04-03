package bball;
import java.sql.*;
import bballDB.DBConnect;

public class League extends DBRecord {
		private int book_id = 0;

		public League(int id, String name){
			super(id, name);
			setType("BOOKS");
			setBookId(0);
		}

		public League(DBConnect DBConn){
			super(DBConn);
			setType("LEAGUE");
			setBookId(0);
		}

                public League(int id, String name, int bookId){
                        super(id, name);
                        setType("BOOKS");
                        setBookId(bookId);
                }

		public ResultSet doSelect(int key){
			return super.doSelect("LEAGUE", key);
		}

		public void doDelete(int key){
			super.doDelete("LEAGUE", key);
		}

		public int getBookId(){
			return book_id;
		}

		public void setBookId(int bookId){
			book_id = bookId;
		}

		public void display(){
			System.out.println("ID: " + getId());
			System.out.println("NAME: " + getName());
			System.out.println("BOOK ID: " + getBookId());
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
