package bball;
import java.sql.*;
import bballDB.DBConnect;

public class Books extends DBRecord {
		//int id;
		//String name;
		//String type;
		//DBAccess dbAccess;

		public Books(int id, String name){
			super(id, name);
			setType("BOOKS");
		}

		public Books(DBConnect DBConn){
			super(DBConn);
			setType("BOOKS");
		}

		public ResultSet doSelect(int key){
			return super.doSelect("BOOKS", key);
		}

		public void doDelete(int key){
			super.doDelete("BOOKS", key);
		}

		public void display(){
			System.out.println("ID: " + getId());
			System.out.println("NAME: " + getName());
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
