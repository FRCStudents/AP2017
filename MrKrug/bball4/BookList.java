package bball;
import java.sql.*;
import java.util.*;

public class BookList {
		private ArrayList<Books> bookList = new ArrayList<Books>();
		private String ListName = "";
		private String[] stringList;

		public BookList(){
			ListName = "PrimeBooks";
			fixStringList();
		}

		public BookList(String name){
			ListName = name;
			fixStringList();
		}

 		private void fixStringList(){
			stringList = new String[bookList.size()];
		}

		public String[] getStringList(){
			fixStringList();
			for(int i=0; i<bookList.size(); i++){
				stringList[i] = bookList.get(i).getName();
			}
			return stringList;
		}

		public void initList(){
			bookList = new ArrayList<Books>();
		}

		public void add(Books b){
			bookList.add(b);
		}

		public void remove(int i){
			bookList.remove(i);
		}

		public void remove(String name){
			for(int i=bookList.size()-1; i >= 0; i--){
				if(name.equals(bookList.get(i).getName())){
					bookList.remove(i);
				}
			}
		}

		public Books get(int i){
			return bookList.get(i);
		}

		public Books get(String name){
			for(int i=0; i<bookList.size(); i++){
				if(name.equals(bookList.get(i).getName())){
					return bookList.get(i);
				}
			}
		return null; 
		}

		public void load(ResultSet rs){
			try {
			   while(rs.next()){
				Books b = new Books(rs.getInt("ID"), rs.getString("NAME"));
				bookList.add(b);
			   }
			} catch(Exception e){
				System.out.println("Crash & Burn: (load(): " + e.getMessage());
			}
		}
		
		public void displayList(){
			for(int i=0; i < bookList.size(); i++){
				bookList.get(i).display();
			}
		}	
}
