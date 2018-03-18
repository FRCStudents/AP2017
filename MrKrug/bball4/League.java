package bball;
import java.sql.*;
import bballDB.DBConnect;

public class League extends DBRecord {
		public League(int id, String name){
			super(id, name);
			setType("BOOKS");
		}

		public League(DBConnect DBConn){
			super(DBConn);
			setType("LEAGUE");
		}

		public ResultSet doSelect(int key){
			return super.doSelect("LEAGUE", key);
		}

		public void doDelete(int key){
			super.doDelete("LEAGUE", key);
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
